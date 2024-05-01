package com.power.pattern.factory.factory_method;

/**
 * @ClassName LatteCoffeeFactory
 * @Description 拿铁咖啡工厂对象，专门用来生产拿铁咖啡
 * @Author Powerveil
 * @Date 2024/5/1 10:21
 * @Version 1.0
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
