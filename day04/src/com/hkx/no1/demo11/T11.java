package com.hkx.no1.demo11;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class T11 {

    @Test
    public void test01(){
        //匿名对象的随机数的使用
        for (int i = 0; i < 5; i++) {
            int r = new Random().nextInt(10);
            System.out.println(r);
        }
        System.out.println("--------------");

    }

    @Test
    public void test02(){
        //匿名对象的输入函数的使用
        System.out.println("输入一个数");
        int sc = new Scanner(System.in).nextInt();
        System.out.println(sc);
    }





}
