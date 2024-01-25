package com.power.principles.demo.after;


/**
 * @ClassName RectangleDemo
 * @Description 测试类
 * @Author Powerveil
 * @Date 2024/1/25 14:26
 * @Version 1.0
 */
public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形对象
         Rectangle rectangle = new Rectangle();
        // 设置长和宽
        rectangle.setLength(20);
        rectangle.setWidth(10);
        // 打印长和宽
        printSize(rectangle);
        // 扩宽方法
        resize(rectangle);
        // 打印长和宽
        printSize(rectangle);
    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    
    // 打印长和宽
    public static void printSize(Quadrilateral quadrilateral) {
        System.out.println("length:" + quadrilateral.getLength());
        System.out.println("width:" + quadrilateral.getWidth());
    }
}
