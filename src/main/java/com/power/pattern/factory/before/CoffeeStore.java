package com.power.pattern.factory.before;

/**
 * @ClassName CoffeeStore
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/3/19 23:26
 * @Version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        // 声明Coffee类型的变量，根据不同的类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("Unknown coffee type: " + type);
        }
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
