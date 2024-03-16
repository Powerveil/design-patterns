package com.power.pattern.singleton.idler.demo1;

/**
 * @ClassName Singleton
 * @Description 懒汉式（线程不安全）
 * @Author Powerveil
 * @Date 2024/3/15 18:02
 * @Version 1.0
 */
public class Singleton {


    // 私有构造方法
    private Singleton() {
    }

    // 声明Singleton类型的变量singleton
    private static Singleton InSTANCE;

    public synchronized static Singleton getInstance() {
        // 判断singleton是否为空，如果为空则创建一个新的对象赋值给singleton，否则直接返回singleton
        if (InSTANCE == null) {
            InSTANCE = new Singleton();
        }
        return InSTANCE;
    }
}
