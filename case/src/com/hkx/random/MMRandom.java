package com.hkx.random;

import java.util.Scanner;

public class MMRandom {


    public static void main(String[] args) {
        double i = 5; //开始有5次
        double money = 1;//共有多少钱
        //随机生成1-100之内的数
        int r = (int) (Math.random() * 100);
//        i = 5;
//        money = 1;

        int j = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);


            System.out.println("--------欢迎进入猜数字游戏--------");
            if(j==0){
                System.out.println("1  开始");
            }else {
                System.out.println("1  继续");
            }

            System.out.println("2  充值");

            int in = sc.nextInt();
            switch (in) {
                case 0:
                    System.exit(0);
                    //游戏开始
                case 1:

                    //判断是否有余额
                    if (money > 0) {
                        while (i != 0) {

                            //免费送5次，充值后
                            if (j == 0) {
                                money = money - 0.2;
                            } else {
                                money = money - 0.33;
                            }

                            String s = String.format("%.2f", money);
                            System.out.println("请输入一个1-100数");


                            //输入一个数
                            int sr = sc.nextInt();

                            //判断
                            if (r == sr) {
                                System.out.println("对了");
                                System.exit(0);
                            } else if (r > sr) {
                                System.out.println("小了,你还有" + (int) (i - 1) + "次");

                                //判断剩余的钱
                                if (money <= 0.2) {
                                    System.out.println("==余额不够请充值==");
                                    money = 0;
                                    break;
                                }
                            } else {
                                System.out.println("大了,你还有" + (int) (i - 1) + "次");

                                //判断剩余的钱
                                if (money <= 0.2) {
                                    System.out.println("==余额不够请充值==（充值1元有3次)==");
                                    money = 0;
                                    break;
                                }
                            }
                            i--;

                        }

                    } else {
                        System.out.println("==余额不够请充值==（充值1元有3次)==");
                    }
                    break;
                //充值
                case 2:
                    System.out.println("充值多少元");
                    int cz = sc.nextInt();
                    if (cz<=0){
                        System.out.println("充值无效");
                    }else {
                        money += cz;
                    }
                    i = 0;
                    i = money * 3;
                    j = 1;
                    System.out.println("充值成功");
                    break;
            }

        }

    }
}
