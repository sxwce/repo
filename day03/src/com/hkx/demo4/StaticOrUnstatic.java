package com.hkx.demo4;

public class StaticOrUnstatic {

    int a;
    static int b;

    public static void Static(){
//        System.out.println(a);   静态不能调用非静态
        System.out.println(b);
    }

    public void UnStatic(){
        System.out.println(a);
        System.out.println(b);
    }
}
