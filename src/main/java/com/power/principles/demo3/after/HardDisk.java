package com.power.principles.demo3.after;

/**
 * @ClassName HardDisk
 * @Description 硬盘接口
 * @Author Powerveil
 * @Date 2024/1/25 14:58
 * @Version 1.0
 */
public interface HardDisk {

    //存储数据
    public void save(String data);

    //获取数据
    public String get();
}
