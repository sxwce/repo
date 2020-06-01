package com.hkx.homeWork.day03.T4;

public class BmwMT extends MoTuoChe implements Gps {
    public BmwMT() {
    }

    public BmwMT(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void bmw() {
        System.out.println("宝马摩托有GPS功能");
    }
}
