package com.hkx.no2.demo7;

public class Test {
    public static void main(String[] args) {

        Basketball t2 = new TTeacher(20, "王五");
        daQiu(t2);
        Basketball s2 = new SStudent(21,"刘备");
        daQiu(s2);

    }

    public static void daQiu(Basketball c){
        c.play();
    }
}
