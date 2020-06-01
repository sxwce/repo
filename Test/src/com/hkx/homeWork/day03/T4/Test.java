package com.hkx.homeWork.day03.T4;

public class Test {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("宝马",100);
        bmw.run();
        bmw.bmw();
        System.out.println("---------------------");
        BmwMT mt = new BmwMT("宝马摩托", 200);
        mt.run();
        mt.bmw();
        System.out.println("---------------------");
        Benz benz = new Benz("奔驰", 100);
        benz.run();
        System.out.println("---------------------");
        YaMaHa ymh = new YaMaHa("雅马哈", 200);
        ymh.run();


    }
}
