package com.hkx.homeWork.day01.T14;

//定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
//
//定义测试类，在主方法中创建对象，直接给对象的属性赋值。
/**
 *
 */
public class Phone {
    private String brand;
    private int price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //有打电话call()和sendMessage()两个功能。

    public void call(){
        //
        //正在使用价格为3998元黑色的小米手机打电话....
        //正在使用价格为3998元黑色的小米手机发短信....
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机打电话。。。");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机发短信。。。");
    }
}
