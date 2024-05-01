package com.power.pattern.factory.factory_method;

/**
 * @ClassName CoffeeStore
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/3/19 23:26
 * @Version 1.0
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;
    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    public CoffeeFactory getCoffeeFactory() {
        return coffeeFactory;
    }

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }
}
