package com.power.principles.demo4.before;

/**
 * @ClassName PowerSafetyDoor
 * @Description Power的安全门
 * @Author Powerveil
 * @Date 2024/1/25 15:14
 * @Version 1.0
 */
public class PowerSafetyDoor implements SafetyDoor {
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireProof() {
        System.out.println("防火");
    }

    public void waterProof() {
        System.out.println("防水");
    }
}
