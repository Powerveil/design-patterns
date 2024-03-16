package com.power.pattern.singleton.destroy.demo2;

import java.lang.reflect.Constructor;

/**
 * @ClassName Client
 * @Description 测试使用反射破坏单例模式
 * @Author Powerveil
 * @Date 2024/3/16 14:38
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws NoSuchMethodException {
        // 1.获取Singleton的字节码对象
        Class clazz = Singleton.class;
        // 2.获取无惨构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        // 3.设置无参构造方法可访问
        cons.setAccessible(true);
        // 4.创建对象
        try {
            Singleton instance1 = (Singleton) cons.newInstance();
            Singleton instance2 = (Singleton) cons.newInstance();
            System.out.println(instance1 == instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
