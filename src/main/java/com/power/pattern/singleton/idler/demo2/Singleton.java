package com.power.pattern.singleton.idler.demo2;

/**
 * @ClassName Singleton
 * @Description 懒汉式：双重检查锁方式
 * @Author Powerveil
 * @Date 2024/3/15 18:12
 * @Version 1.0
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {
    }

    // 声明Singleton类型的变量singleton
    private static volatile Singleton InSTANCE;

    public static Singleton getInstance() {
        // 判断singleton是否为空，如果为空则创建一个新的对象赋值给singleton，否则直接返回singleton
        if (InSTANCE == null) {
            // 加锁
            synchronized (Singleton.class) {
                if (InSTANCE == null) {
                    InSTANCE = new Singleton();
                }
                return InSTANCE;
            }
        }
        return InSTANCE;
    }
}
