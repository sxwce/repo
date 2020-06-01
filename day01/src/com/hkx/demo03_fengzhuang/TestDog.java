package com.hkx.demo03_fengzhuang;

public class TestDog {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(18);
        d.setName("哈士奇");
        System.out.println(d.getAge());
        System.out.println(d.getName());
    }
}
