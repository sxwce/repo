package com.hkx.demo03_fengzhuang;

public class Dog {
    private int age;
    private String name;
    public void bark(){
        System.out.println("狗在叫...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
