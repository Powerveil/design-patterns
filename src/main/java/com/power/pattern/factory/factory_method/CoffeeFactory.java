package com.power.pattern.factory.factory_method;

/**
 * @ClassName CoffeeTactory
 * @Description CoffeeFactory：抽象工厂
 * @Author Powerveil
 * @Date 2024/5/1 10:18
 * @Version 1.0
 */
public interface CoffeeFactory {
    // 创建咖啡对象的方法
    Coffee createCoffee();
}
