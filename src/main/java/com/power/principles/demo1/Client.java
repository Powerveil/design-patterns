package com.power.principles.demo1;

/**
 * @ClassName Client
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/1/25 12:06
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 1.创建搜狗输入法对象
        SougouInput input = new SougouInput();
        // 2.创建皮肤对象
//        DefaultSkin skin = new DefaultSkin();
        PowerSkin skin = new PowerSkin();
        // 2.将皮肤设置到输入法中
        input.setSkin(skin);

        // 4.显示皮肤
        input.display();
    }
}
