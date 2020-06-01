package com.hkx.demo2;

public class TestPerson {
    public static void main(String[] args) {
        Person jackChen = new Person();
        jackChen.name = "成龙";
        jackChen.job = "武打明星";
        jackChen.nation = "中华人民共和国";

        System.out.println(jackChen.name+","+jackChen.job+","+jackChen.nation);
        //2.创建第二个对象
        Person liuYan = new Person();
        liuYan.name = "小妍妍";
        liuYan.job = "球星";
        liuYan.nation = "小米共和国";

        System.out.println(liuYan.name+","+liuYan.job+","+liuYan.nation);
        //3.再次打印成龙属性
        System.out.println(jackChen.name+","+jackChen.job+","+jackChen.nation);
    }
}
