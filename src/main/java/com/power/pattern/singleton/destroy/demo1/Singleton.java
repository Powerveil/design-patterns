package com.power.pattern.singleton.destroy.demo1;

import java.io.Serializable;

/**
 * @ClassName Singleton
 * @Description 测试使用反射破坏单例模式
 * @Author Powerveil
 * @Date 2024/3/15 18:28
 * @Version 1.0
 */
public class Singleton implements Serializable {
    private Singleton() {}
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 当进行反序列化是，会自动调用该方法，将该方法的返回值直接返回
    private Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
