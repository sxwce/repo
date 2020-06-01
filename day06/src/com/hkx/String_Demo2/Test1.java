package com.hkx.String_Demo2;

/**
 * 判断功能
 */
public class Test1 {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "hello world";
        String s3 = "Hello World";

        //内容比较
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println("------");

        //忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("------");

        //是否存在
        System.out.println(s1.contains("h"));
        System.out.println(s3.contains("W"));
        System.out.println("------");

        //判断开头
        System.out.println(s1.startsWith("hel"));
        System.out.println(s3.startsWith("Hel"));
        System.out.println("------");

        //判断结尾
        System.out.println(s1.endsWith("ld"));
        System.out.println(s3.endsWith("World"));

    }
}
