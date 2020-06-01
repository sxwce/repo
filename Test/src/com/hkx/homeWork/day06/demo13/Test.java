package com.hkx.homeWork.day06.demo13;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件名：");
        String fName = sc.nextLine();
        System.out.println("第一个字符：" + fName.charAt(0));
        System.out.println("后缀名：" + fName.substring(fName.lastIndexOf(".")));
        fName = fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase();
        System.out.println("转换效果：" + fName);

    }
}
