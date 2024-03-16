package com.power.pattern.singleton.jdk;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName RuntimeDemo
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/3/16 15:01
 * @Version 1.0
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        // 获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();
        // 调用Runtime的方法exec，参数要的是命令ds
        Process process = runtime.exec("ipconfig");
        // 获取命令的输出流
        InputStream inputStream = process.getInputStream();
        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len = inputStream.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len, "GBK"));
        }
    }
}
