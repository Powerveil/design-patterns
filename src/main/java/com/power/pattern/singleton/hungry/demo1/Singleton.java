package com.power.pattern.singleton.hungry.demo1;

/**
 * @ClassName Singleton
 * @Description 饿汉式
 * @Author Powerveil
 * @Date 2024/3/15 17:50
 * @Version 1.0
 */
public class Singleton {
    // 私有构造方法
    private Singleton() {}


    // 2.在本类中创建本类对象
    private static final Singleton INSTANCE = new Singleton();

    // 3.提供一个公共的访问方式，让外界获取该对象
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
