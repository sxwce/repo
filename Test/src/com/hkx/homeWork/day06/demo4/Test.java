package com.hkx.homeWork.day06.demo4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入统计字符串中英文字母和数字");
        String s = new Scanner(System.in).next();
        s.toUpperCase();
        int shuzi = 0;
        int zimu = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a'<=c&&c<='z'){
                zimu++;
            }else {
                shuzi++;
            }
        }
        System.out.println("数字"+shuzi);
        System.out.println("字母" + zimu);
    }
}
