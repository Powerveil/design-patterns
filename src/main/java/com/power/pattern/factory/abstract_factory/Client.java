package com.power.pattern.factory.abstract_factory;

/**
 * @ClassName Client
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/5/1 10:47
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建的是意大利风味甜品工厂对象
//        DessertFactory factory = new ItalyDessertFactory();
        DessertFactory factory = new AmericanDessertFactory();
        // 获取对应的拿铁咖啡和提拉米苏甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
