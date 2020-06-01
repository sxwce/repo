package com.hkx.homeWork.day06.demo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入工人姓名");
        String name = scanner.next();
        System.out.println("请录入工人工龄");
        int year = scanner.nextInt();
        Worker worker = new Worker(name, year);
        System.out.println("该工人对象的信息如下:");
        System.out.println("姓名:" + worker.getName());
        System.out.println("工龄:" + worker.getYear());

    }
}
