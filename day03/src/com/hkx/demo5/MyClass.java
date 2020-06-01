package com.hkx.demo5;

public class MyClass implements MyInterface {
    @Override
    public void abs1() {
        //重写抽象方法
        System.out.println("abs1");
    }

    @Override
    public void abs2() {
        //重写抽象方法
        System.out.println("abs2");
    }

    @Override
    public void d1() {
        //默认方法要去掉default
        System.out.println("d1");
    }

    @Override
    public void d2() {
        //默认方法要去掉default
        System.out.println("d2");
    }

    //静态方法不能重写
//    public void s2(){
//        System.out.println("s2....");
//    }

}
