package com.hkx.homeWork.day03.T45;

public class UI extends YuanGong implements HuiHua {
    public UI() {
    }

    public UI(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void HuaHua() {
        System.out.println("我在画画");
    }
}
