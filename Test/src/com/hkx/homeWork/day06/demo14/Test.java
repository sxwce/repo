package com.hkx.homeWork.day06.demo14;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息");
        String s = sc.nextLine();
        s = s.replace(" ", "");
        String[] split = s.split(",");
        Student student = new Student(split[0],Integer.parseInt(split[1]),split[2].charAt(0));
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSex());
    }
}
