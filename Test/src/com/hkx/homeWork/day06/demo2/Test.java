package com.hkx.homeWork.day06.demo2;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        yzm();
    }
    public static void yzm(){
        StringBuilder stringBuilder = new StringBuilder();
        //增加0-9
        for (int i = 0; i <= 9; i++){
            stringBuilder.append(i);
        }
        //增加a-z
        for (char i = 'a'; i <= 'z'; i++){
            stringBuilder.append(i);
        }
        //增加A-Z
        for (char i = 'A'; i <= 'Z'; i++){
            stringBuilder.append(i);
        }
        //创建Random()对象
        Random r = new Random();
        //创建一个空字符串
        String code = "";
        //生成4次随机数
        for (int i = 0; i < 4; i++) {
            //获得stringBuilder中的一个字符串
            int j = r.nextInt(stringBuilder.length());
            //字符串拼接
            code += stringBuilder.charAt(j);
        }
        //打印验证码
        System.out.println(code);
    }
}
