package com.power.principles.demo4.before;

/**
 * @ClassName Client
 * @Description 调用类
 * @Author Powerveil
 * @Date 2024/1/25 15:15
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        PowerSafetyDoor door = new PowerSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
