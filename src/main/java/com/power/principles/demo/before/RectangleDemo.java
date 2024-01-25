package com.power.principles.demo.before;

/**
 * @ClassName RectangeDemo
 * @Description 测试类
 * @Author Powerveil
 * @Date 2024/1/25 14:11
 * @Version 1.0
 */
public class RectangleDemo {
    public static void main(String[] args) {
        // 创建一个矩形
        Rectangle rectangle = new Rectangle();
        // 设置矩形的宽和长
        rectangle.setWidth(10);
        rectangle.setLegth(20);
        // 打印矩形的宽和长
        printRectangle(rectangle);
        // 调整矩形的宽和长
        resize(rectangle);
        // 打印矩形的宽和长
        printRectangle(rectangle);
        System.out.println("=======================");
        // 创建正方形对象
        Square square = new Square();
        // 设置正方形的宽和长
        square.setLegth(10);
        // 打印正方形的宽和长
        printRectangle(square);
        // 调整正方形的宽和长
        resize(square);
        // 打印正方形的宽和长
        printRectangle(square);

    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLegth()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printRectangle(Rectangle rectangle) {
        System.out.println("Rectangle legth: " + rectangle.getLegth());
        System.out.println("Rectangle width: " + rectangle.getWidth());
    }
}
