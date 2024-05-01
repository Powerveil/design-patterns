package com.power.pattern.factory.simple.static_facroty;

/**
 * @ClassName Client
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/5/1 10:02
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");
//        Coffee coffee = store.orderCoffee("american");
        System.out.println(coffee.getName());

    }
}
