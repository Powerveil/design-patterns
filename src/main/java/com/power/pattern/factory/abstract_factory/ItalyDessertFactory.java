package com.power.pattern.factory.abstract_factory;

/**
 * @ClassName ItalyDessertFactory
 * @Description
 * 意大利风味甜品工厂：
 * 1. 生产拿铁咖啡
 * 2. 生产提拉米苏甜品
 *
 * @Author Powerveil
 * @Date 2024/5/1 10:45
 * @Version 1.0
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
