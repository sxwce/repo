package com.hkx.no2.demo6;

public class Test {
    public static void main(String[] args) {
        OldPhone.call();
        OldPhone.sendMesage();
        System.out.println("-----------");
        NewPhnoe.call();
        NewPhnoe.sendMesage();
        Play p = new NewPhnoe();
        p.playGame();

    }
}
