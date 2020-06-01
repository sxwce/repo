package com.hkx.no2.demo3;

public class Coder extends Parent {
    public Coder() {
    }

    public Coder(String name, int age) {
        super(name, age);
    }
    public void daiMai(){
        System.out.println(this.getName()+"敲代码");
    }
}
