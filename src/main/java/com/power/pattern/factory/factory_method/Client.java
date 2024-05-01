package com.power.pattern.factory.factory_method;

/**
 * @ClassName Client
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/5/1 10:23
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        // 创建工厂对象
//        CoffeeFactory factory = new LatteCoffeeFactory();
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setCoffeeFactory(factory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
