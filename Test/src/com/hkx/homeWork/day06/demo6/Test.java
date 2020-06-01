package com.hkx.homeWork.day06.demo6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String s = sc.nextLine();
        System.out.println(getNum(s));
    }
    public static String getNum(String s) {
        if (s.length() != 18) {
            return "错误";
        }
        if (s.startsWith("0")) {
            return "错误";
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == s.length() - 1) {
                if (c < '0' || c > '9' && c != 'X') {
                    return "错误";
                }
            } else {
                if (c < '0' || c > '9') {
                    return "错误";
                }
            }
        }
        return "正确";

    }
}
