package com.hkx.homeWork.day06.demo11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入内容");
        String next = new Scanner(System.in).next();
        System.out.println(next.replace("特朗普", "***"));
    }
}
