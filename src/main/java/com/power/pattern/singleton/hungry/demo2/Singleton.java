package com.power.pattern.singleton.hungry.demo2;

/**
 * @ClassName Singleton
 * @Description 饿汉式：静态代码块
 * @Author Powerveil
 * @Date 2024/3/15 17:56
 * @Version 1.0
 */
public class Singleton {

    // 1. 私有静态实例
    private static Singleton singleton;

    // 2. 静态代码块
    static {
        singleton = new Singleton();
    }

    // 3. 私有构造函数
    private Singleton() {
    }

    // 4. 公有静态方法
    public static Singleton getInstance() {
        return singleton;
    }
}
