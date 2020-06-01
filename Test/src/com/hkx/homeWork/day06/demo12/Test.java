package com.hkx.homeWork.day06.demo12;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[] keyArray = {"特朗普","普京"};
        System.out.println("请输入内容");
        String next = new Scanner(System.in).next();
        String replace = next.replace(keyArray[0], "***");
        String s = replace.replace(keyArray[1], "***");
        System.out.println(s);

    }
}
