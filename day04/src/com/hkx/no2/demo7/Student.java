package com.hkx.no2.demo7;

public class Student extends Parent {
    public Student(int age, String name) {
        super(age, name);
    }

    public Student() {
    }

    @Override
    public void eat() {
        System.out.println("学生餐");
    }
    public void study(){
        System.out.println("学习");
    }

}
