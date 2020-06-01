package com.hkx.demo5;

public interface MyInterface {

    //抽象方法
    public abstract void abs1();
    public abstract void abs2();
    //默认方法
    public default void d1(){
        System.out.println("d1....");
    }
    public default void d2(){
        System.out.println("d2....");
    }
    //静态方法
    public static void s1(){
        System.out.println("s1....");
    }
    public static void s2(){
        System.out.println("s2....");
    }
}
