package com.hkx.no2.demo4;

public class Test {
    public static void main(String[] args) {
         Manager m = new Manager("11", "王五", 3333);
         m.eat();
         m.work();
         Cook c = new Cook("22", "宋江", 444);
         c.eat();
         c.work();
    }
}
