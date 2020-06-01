package com.hkx.no2.demo7;

public class TTeacher extends Teacher implements Basketball {
    public TTeacher(int age, String name) {
        super(age, name);
    }

    public TTeacher() {
    }

    @Override
    public void play() {
        System.out.println("年龄为" + getAge() + "岁 " + getName() + " 的老师在打篮 球");
    }
}
