package com.hkx.homeWork.day03.T4;

//宝马车
public class Bmw extends Car implements Gps {

    public Bmw() {
    }

    public Bmw(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void bmw() {
        System.out.println("宝马车GPS功能");
    }
}
