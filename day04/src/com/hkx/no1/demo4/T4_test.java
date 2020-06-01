package com.hkx.no1.demo4;

public class T4_test {
    public static void main(String[] args) {
        T4 无 = new T4();
        无.setUserName("张三");
        无.setPassword("asd344");
        无.user();
        System.out.println("===========");

        T4 有 = new T4("李四","dfg1323");
        有.user();
    }
}
