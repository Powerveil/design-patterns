package com.power.principles.demo.after;

/**
 * @ClassName Square
 * @Description 正方形
 * @Author Powerveil
 * @Date 2024/1/25 14:24
 * @Version 1.0
 */
public class Square implements Quadrilateral{

    private double side;
    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
