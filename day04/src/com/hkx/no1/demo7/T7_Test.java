package com.hkx.no1.demo7;

import org.junit.Test;

public class T7_Test extends T7 {
    @Override
    public void run() {
        System.out.println("张三在写代码");
    }

    @Test
    public void Test(){
        run();
    }
}
