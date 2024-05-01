package com.power.pattern.factory.simple.static_facroty;


/**
 * @ClassName CoffeeStore
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/3/19 23:26
 * @Version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
