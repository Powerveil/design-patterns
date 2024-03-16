package com.power.pattern.singleton.idler.demo2;


/**
 * @ClassName Client
 * @Description 测试类
 * @Author Powerveil
 * @Date 2024/3/15 18:13
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
