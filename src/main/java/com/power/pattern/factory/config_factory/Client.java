package com.power.pattern.factory.config_factory;

/**
 * @ClassName Client
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/5/1 11:10
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
//        Coffee coffee = CoffeeFactory.createCoffee("latte");
        System.out.println(coffee.getName());
    }
}
