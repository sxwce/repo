package com.hkx.no2.demo6;

public class NewPhnoe extends OldPhone implements Play {

    public NewPhnoe() {
    }

    @Override
    public void playGame() {
        System.out.println("play功能");
    }
}
