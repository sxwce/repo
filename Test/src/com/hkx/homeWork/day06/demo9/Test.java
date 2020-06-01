package com.hkx.homeWork.day06.demo9;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一个邮箱地址");
        String next = new Scanner(System.in).next();
        if (next.contains("@") && next.contains(".")) {
            System.out.println("合法");
        } else {
            System.out.println("不合法");
        }
    }
}
