package com.power.principles.demo1;

/**
 * @ClassName SougouInput
 * @Description 搜狗输入法
 * @Author Powerveil
 * @Date 2024/1/25 12:04
 * @Version 1.0
 */
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
         skin.display();
    }
}
