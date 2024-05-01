package com.power.pattern.factory.factory_method;

/**
 * @ClassName AmericanCoffeeFactory
 * @Description 美式咖啡工厂对象，专门用来生产美式咖啡
 * @Author Powerveil
 * @Date 2024/5/1 10:20
 * @Version 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
