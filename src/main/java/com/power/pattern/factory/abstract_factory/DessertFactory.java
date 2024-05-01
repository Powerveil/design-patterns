package com.power.pattern.factory.abstract_factory;

/**
 * @ClassName DessertFactory
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/5/1 10:42
 * @Version 1.0
 */
public interface DessertFactory {
    // 生产咖啡的功能
    Coffee createCoffee();

    // 生产甜品的功能
    Dessert createDessert();
}
