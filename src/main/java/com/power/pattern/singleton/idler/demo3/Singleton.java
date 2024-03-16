package com.power.pattern.singleton.idler.demo3;

/**
 * @ClassName Singleton
 * @Description 静态内部类方式
 * @Author Powerveil
 * @Date 2024/3/15 18:19
 * @Version 1.0
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
