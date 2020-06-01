package com.hkx.tuxing;

import java.util.Scanner;

public class zsjx {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入 * 的行数：");
        int n = input.nextInt();

        for (int x=0; x<n; x++) {
            for (int y=x+1; y<n; y++) {
                System.out.print(" ");
            }
            for (int z=0; z<=x; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
