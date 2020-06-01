package com.hkx.homeWork.day06.demo5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入对称字符串");
        String next = new Scanner(System.in).next();
        duicheng(next);
    }
    public static void duicheng(String next){
        StringBuilder stringBuilder = new StringBuilder(next);
//        StringBuilder append = stringBuilder.append(next);
        String s = stringBuilder.reverse().toString();
        if (s.equals(next)){
            System.out.println("这是一个对称的");
        }else {
            System.out.println("这是不一个对称的");
        }
    }
}
