package com.hkx.no2.demo5;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("666", "傅红雪");  l.work();
        Tutor t = new Tutor("668", "顾棋");
        t.work();
        Maintainer m = new Maintainer("686", "庖丁");
        m.work();
        Buyer b = new Buyer("888", "景甜");
        b.work();
    }

}
