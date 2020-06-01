package com.hkx.no2.demo7;

public class Teacher extends Parent{
    public Teacher(int age, String name) {
        super(age, name);
    }

    public Teacher() {
    }

    @Override
    public void eat() {
        System.out.println("老师吃饭");
    }

}
