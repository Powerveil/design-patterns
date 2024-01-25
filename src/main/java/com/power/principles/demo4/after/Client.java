package com.power.principles.demo4.after;

/**
 * @ClassName Client
 * @Description 测试类
 * @Author Powerveil
 * @Date 2024/1/25 15:18
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建黑马安全门对象
        PowerSafetyDoor door = new PowerSafetyDoor();
        //调用功能
        door.antiTheft();
        door.fireproof();
        door.waterproof();

        System.out.println("============");
        //创建传智安全门对象
        PowerveilSafetyDoor door1 = new PowerveilSafetyDoor();
        //调用功能
        door1.antiTheft();
        door1.fireproof();
    }
}
