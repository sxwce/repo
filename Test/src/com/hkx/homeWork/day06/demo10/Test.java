package com.hkx.homeWork.day06.demo10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一个java文件名");
        String next = new Scanner(System.in).next();
        if (next.endsWith(".java")) {
            System.out.println("合法");
            System.out.println(".的索引位置"+next.lastIndexOf("."));
        } else {
            System.out.println("不合法");
        }
    }
}
