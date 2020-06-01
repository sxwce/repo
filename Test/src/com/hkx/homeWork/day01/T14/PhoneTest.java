package com.hkx.homeWork.day01.T14;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("小米");
        p1.setColor("黑色");
        p1.setPrice(3999);
        p1.call();
        p1.sendMessage();
    }
}
