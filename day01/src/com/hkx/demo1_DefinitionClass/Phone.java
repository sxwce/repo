package com.hkx.demo1_DefinitionClass;

/**
 * 自定义的手机类
 */
public class Phone {

    //成员变量
    public int prince; //价格
    public String brand;   //品牌
    public String color;   //颜色

    public void call(String number){
        System.out.println("正在给"+number+"打电话");
    }

    public void sendMsg(String number,String contect){
        System.out.println("给"+number+"打电话"+"内容为"+contect);
    }
}
