package com.hkx.demo3;

public class TestStaticMethod {
    public static void main(String[] args) {
        add a = new add();
        int sum = a.getSum(1, 2);
        System.out.println(sum);
        System.out.println("================");

        System.out.println(add.getSum(2, 4));
    }
}
