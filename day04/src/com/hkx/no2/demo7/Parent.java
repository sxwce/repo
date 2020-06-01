package com.hkx.no2.demo7;

public abstract class Parent {
    //学生都有年龄和姓名属性,有吃饭(学生餐)和学习方法,但是有部分学生会打篮球
    // 老师都有年龄和姓名属性,有吃饭(工作餐)和讲课方法,但是有部分老师会打篮球
    // 定义一个方法模拟去打篮球,只要会打篮球的人都可以传入. (提示通过在测试类中定义一个方法参数为接口)

    private int age;
    private String name;

    public Parent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Parent() {
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
    public abstract void eat();
}
