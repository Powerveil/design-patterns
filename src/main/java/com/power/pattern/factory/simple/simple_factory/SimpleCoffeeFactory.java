package com.power.pattern.factory.simple.simple_factory;

/**
 * @ClassName SimpleCoffeeFactory
 * @Description 简单咖啡工厂类，用来生产咖啡
 * @Author Powerveil
 * @Date 2024/5/1 9:56
 * @Version 1.0
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        // 声明Coffee类型的变量，根据不同的类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("Unknown coffee type: " + type);
        }
        return coffee;
    }
}
