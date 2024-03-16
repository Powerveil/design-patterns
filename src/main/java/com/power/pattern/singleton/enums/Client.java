package com.power.pattern.singleton.enums;

/**
 * @ClassName Client
 * @Description 测试类
 * @Author Powerveil
 * @Date 2024/3/15 18:25
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}
