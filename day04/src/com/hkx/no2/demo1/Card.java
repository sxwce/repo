package com.hkx.no2.demo1;

public class Card {
    private String huaSe;
    private String dianShu;

    public Card() {
    }

    public Card(String huaSe, String dianShu) {
        this.huaSe = huaSe;
        this.dianShu = dianShu;
    }

    public String getHuaSe() {
        return huaSe;
    }

    public void setHuaSe(String huaSe) {
        this.huaSe = huaSe;
    }

    public String getDianShu() {
        return dianShu;
    }

    public void setDianShu(String dianShu) {
        this.dianShu = dianShu;
    }

    public void showCard(){
        System.out.println(huaSe+dianShu);
    }
}
