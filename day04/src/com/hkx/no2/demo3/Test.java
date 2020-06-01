package com.hkx.no2.demo3;

public class Test {
    public static void main(String[] args) {
        Coder c = new Coder();
        c.setName("张三");
        c.sleep();
        c.eat();
        c.daiMai();
        Teacher teacher = new Teacher();
        teacher.setName("李四");
        teacher.eat();
        teacher.sleep();
        teacher.teach();
    }
}
