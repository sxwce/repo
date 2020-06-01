package com.hkx.no2.demo3;

public class Parent {
//    程序员(Coder) 成员变量: 姓名,年龄 成员方法: 吃饭,睡觉,敲代码
//    老师(Teacher) 成员变量: 姓名,年龄 成员方法: 吃饭,睡觉,上课
    private String name;
    private int age;

    public Parent() {
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println(this.getName()+"吃饭");
    }
    public void sleep(){
        System.out.println(this.getName()+"睡觉");
    }
}
