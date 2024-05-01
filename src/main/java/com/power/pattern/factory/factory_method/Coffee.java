package com.power.pattern.factory.factory_method;

/**
 * @ClassName Coffee
 * @Description 咖啡类
 * @Author Powerveil
 * @Date 2024/3/16 15:41
 * @Version 1.0
 */
abstract public class Coffee {

    public abstract String getName();

    // 加糖
    public void addSugar() {
        System.out.println("Coffee add sugar");
    }
    // 加奶
    public void addMilk() {
        System.out.println("Coffee add milk");
    }
}
