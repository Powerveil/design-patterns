package com.power.pattern.singleton.hungry.demo1;

/**
 * @ClassName Client
 * @Description 测试类
 * @Author Powerveil
 * @Date 2024/3/15 17:53
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建Singleton类的对象
        Singleton instance1 = Singleton.getInstance();
        // 创建Singleton类的对象
        Singleton instance2 = Singleton.getInstance();
        // 判断两个对象是否相等
        System.out.println(instance1 == instance2);
    }
}
