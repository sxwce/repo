package com.hkx.no2.demo7;

public class SStudent extends Student implements Basketball {

    public SStudent(int age, String name) {
        super(age, name);
    }

    public SStudent() {
    }

    @Override
    public void play() {
        System.out.println("年龄为" + getAge() + "岁 " + getName() + " 的学生在打篮 球");
    }
}
