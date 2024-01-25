package com.power.principles.demo.after;

/**
 * @ClassName Rectangle
 * @Description 长方形
 * @Author Powerveil
 * @Date 2024/1/25 14:24
 * @Version 1.0
 */
public class Rectangle implements Quadrilateral{

    private double length;
    private double width;

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
