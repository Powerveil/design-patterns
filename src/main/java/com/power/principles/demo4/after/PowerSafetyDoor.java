package com.power.principles.demo4.after;

/**
 * @ClassName PowerSafetyDoor
 * @Description Power安全门
 * @Author Powerveil
 * @Date 2024/1/25 15:17
 * @Version 1.0
 */
public class PowerSafetyDoor implements AntiTheft,Fireproof,Waterproof {
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireproof() {
        System.out.println("防火");
    }

    public void waterproof() {
        System.out.println("防水");
    }
}
