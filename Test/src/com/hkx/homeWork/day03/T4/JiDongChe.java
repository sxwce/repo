package com.hkx.homeWork.day03.T4;

//机动车类
public class JiDongChe {

    private String brand;  //品牌
    private double price;   //价格

    public JiDongChe() {
    }

    public JiDongChe(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void run(){
        System.out.println("价格为"+price+"的"+brand+"在运行");
    }
}
