package com.hkx.demo04_Teacher;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setId("1111");
        t.setName("张三");
        t.teach();
        System.out.println("========");
        Teacher t2 = new Teacher("2222","李四");
        t2.teach();

    }
}
