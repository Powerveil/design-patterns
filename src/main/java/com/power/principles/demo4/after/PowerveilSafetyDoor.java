package com.power.principles.demo4.after;

/**
 * @ClassName PowerveilSafetyDoor
 * @Description Powerveil安全门
 * @Author Powerveil
 * @Date 2024/1/25 15:18
 * @Version 1.0
 */
public class PowerveilSafetyDoor implements AntiTheft,Fireproof {
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireproof() {
        System.out.println("防火");
    }
}
