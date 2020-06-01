package com.hkx.homeWork.day03.T45;

public class YuanGong {

    private String name;
    private String sex;
    private int age;

    public YuanGong() {
    }

    public YuanGong(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void work(){

        System.out.println("姓名"+name+" 性别"+sex+" 年龄"+age+" 在工作");
    }
}
