package com.hkx.homeWork.day02;

import lombok.Data;

@Data
public abstract class Parent {

    private String id;
    private String name;
    private String sex;
    private int age;

    public Parent() {
    }

    public Parent(String id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }



    public abstract void eat();
}
