package com.hkx.demo1_DefinitionClass;

public class TestPhone {
    public static void main(String[] args) {
        //创建一个对象
        Phone p = new Phone();
        //访问对象中的成员变量
        p.brand = "小米";
        p.prince = 999;
        p.color = "杏仁黄";
        System.out.println(p.brand);
        System.out.println(p.prince);
        System.out.println(p.color);

        p.call("1111111");
        p.sendMsg("我","11111");
    }
}
