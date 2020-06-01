package com.hkx.demo2_student;

public class TestStuden {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(11);
        s.setName("我");
        s.show();
        System.out.println("===============");
        Student s2 = new Student("你",22);
        s2.show();
    }
}
