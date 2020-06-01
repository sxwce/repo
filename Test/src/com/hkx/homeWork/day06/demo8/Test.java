package com.hkx.homeWork.day06.demo8;

public class Test {
    public static void main(String[] args) {
        String s = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的\"。请编写程序，统计该文本中\"Java\"一词出现的次数";
        String replace = s.replace("Java", "");
        //(字符串原长度-去掉Java后的长度)/(Java的长度)
        int i = (s.length()-replace.length())/4;
        System.out.println("Java出现了"+i+"次");

    }
}
