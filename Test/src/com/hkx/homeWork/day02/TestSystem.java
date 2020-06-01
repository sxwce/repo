package com.hkx.homeWork.day02;

public class TestSystem {
    public static void main(String[] args) {
        Student s = new Student("V5V5","张三","男",20,"javaEE17班");
        s.msg();
        s.eat();
        System.out.println("===========");

        coach c = new coach("6b6b","李四","男",300);
        c.msg();
        c.eat();

    }
}
