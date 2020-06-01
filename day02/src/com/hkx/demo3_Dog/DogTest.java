package com.hkx.demo3_Dog;

public class DogTest {

    public static void main(String[] args) {
        //1.创建对象
        Dog dd = new Dog();
        //2.访问成员变量
//        dd.name = "旺财";
        dd.setName("旺财");
        System.out.println(dd.getName());
    }
}

 class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    //Dog类有没有继承name成员变量?
    public void show(){
        System.out.println(getName());
    }
}