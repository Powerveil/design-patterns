package com.power.principles.demo.before;

/**
 * @ClassName Square
 * @Description 正方形类
 * @Author Powerveil
 * @Date 2024/1/25 14:10
 * @Version 1.0
 */
public class Square extends Rectangle {
    @Override
    public void setLegth(double legth) {
        super.setLegth(legth);
        super.setWidth(legth);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLegth(width);
    }
}
