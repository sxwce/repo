package com.hkx.homeWork.day02;

public class coach extends Parent {

    @Override
    public void eat() {
        System.out.println("吃饭(吃工作餐)");
    }

    public coach() {
    }

    public coach(String id, String name, String sex, int age) {
        super(id, name, sex, age);
    }

    public void msg(){
        System.out.println(getId()+" "+getName()+" "+getSex()+" "+getAge());
    }

}
