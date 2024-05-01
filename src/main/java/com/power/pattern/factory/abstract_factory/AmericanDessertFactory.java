package com.power.pattern.factory.abstract_factory;

/**
 * @ClassName AmericanDessertFactory
 * @Description
 * 美式风味的甜品工厂：
 * 1. 创建美式咖啡
 * 2. 创建抹茶慕斯
 *
 * @Author Powerveil
 * @Date 2024/5/1 10:44
 * @Version 1.0
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
