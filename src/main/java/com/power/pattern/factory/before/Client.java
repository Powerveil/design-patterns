package com.power.pattern.factory.before;

/**
 * @ClassName Client
 * @Description 测试类
 * @Author Powerveil
 * @Date 2024/3/19 23:30
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 1.创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        // 2.点咖啡
//        Coffee coffee = store.orderCoffee("latte");
        Coffee coffee = store.orderCoffee("american");

        System.out.println(coffee.getName());
    }
}
