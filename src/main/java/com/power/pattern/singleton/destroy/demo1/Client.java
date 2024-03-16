package com.power.pattern.singleton.destroy.demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName Client
 * @Description 测试使用反射破坏单例模式
 * @Author Powerveil
 * @Date 2024/3/15 18:28
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
//        writeToFile();
        readFromFile();
        readFromFile();
    }

    // 从文件中读取数据(对象)
    public static void readFromFile() throws Exception{
        // 1.创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\code\\test\\destory\\a.txt"));
        // 2.从文件中读取对象
        Singleton singleton = (Singleton) ois.readObject();
        // 3.关闭流
        ois.close();
        // 4.打印对象
        System.out.println(singleton);
    }

    // 向文件中写数据(对象)
    public static void writeToFile() throws Exception{
        // 1.获取Singleton对象
        Singleton singleton = Singleton.getInstance();
        // 2.创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\code\\test\\destory\\a.txt"));
        // 3.将对象写入到文件中
        oos.writeObject(singleton);
        // 4.关闭流
        oos.close();
    }

}
