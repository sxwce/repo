package com.hkx.no2.demo3;

public class Teacher extends Parent {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println(this.getName()+"上课");
    }
}
