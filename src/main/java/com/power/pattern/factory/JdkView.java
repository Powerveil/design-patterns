package com.power.pattern.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName JdkTest
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/5/1 11:20
 * @Version 1.0
 */
public class JdkView {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Iterator<String> iterator = collection.iterator();
        // 抽象工厂 Collection
        // 具体工厂 ArrayList
        // 抽象产品 Iterator
        // 具体产品 Itr
        //         ArrayList 源码 iterator()方法和内部类Itr


    }
}
