package com.hkx.homeWork.day06.demo3;

import java.util.Random;
import java.util.Scanner;


public class Test {

    static String code = null;

    public static void main(String[] args) {
        //创建一个空字符串
        boolean flag = true;
        while (true) {
            code = yzm();
            System.out.println("请输入验证码");
            System.out.println("验证码为:" + code);
            String next = new Scanner(System.in).next();
            //判断验证码是否正确
            if (code.equalsIgnoreCase(next)) {
                System.out.println("正确");
                flag = false;
                break;
            } else {
                code = "";
                System.out.println("错误,重新输入");
            }

        }
    }

    public static String yzm() {
        StringBuilder stringBuilder = new StringBuilder();
        //增加0-9
        for (int i = 0; i <= 9; i++) {
            stringBuilder.append(i);
        }
        //增加a-z
        for (char i = 'a'; i <= 'z'; i++) {
            stringBuilder.append(i);
        }
        //增加A-Z
        for (char i = 'A'; i <= 'Z'; i++) {
            stringBuilder.append(i);
        }
        //创建Random()对象
        Random r = new Random();
        code = "";
        //生成4次随机数
        for (int i = 0; i < 4; i++) {
            //获得stringBuilder中的一个字符串
            int j = r.nextInt(stringBuilder.length());
            //字符串拼接
            code += stringBuilder.charAt(j);
        }
        return code;

    }
}