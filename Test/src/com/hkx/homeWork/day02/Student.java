package com.hkx.homeWork.day02;

public class Student extends Parent {

    private String className;

    public Student(String className) {
        this.className = className;
    }

    public Student(String id, String name, String sex, int age, String className) {
        super(id, name, sex, age);
        this.className = className;
    }

    @Override
    public void eat() {
        System.out.println("吃饭(吃营养餐)");
    }

    public void msg(){
        System.out.println(getId()+" "+getName()+" "+getSex()+" "+getAge()+" "+className);
    }
}
