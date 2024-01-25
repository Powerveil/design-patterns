package com.power.principles.demo3.after;

/**
 * @ClassName XiJieHardDisk
 * @Description 希捷硬盘
 * @Author Powerveil
 * @Date 2024/1/25 15:00
 * @Version 1.0
 */
public class XiJieHardDisk implements HardDisk {

    //存储数据的方法
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    //获取数据的方法
    public String get() {
        System.out.println("使用希捷希捷硬盘取数据");
        return "数据";
    }
}

