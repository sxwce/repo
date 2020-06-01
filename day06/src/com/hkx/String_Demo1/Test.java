package com.hkx.String_Demo1;

public class Test {
    public static void main(String[] args) {
        System.out.println("--------");
        String s = new String();
        System.out.println(s);

        System.out.println("--------");
        String s2 = new String("abc");
        System.out.println("s2" + s2);

        System.out.println("--------");
        char[] chs = {'A', 'B', 'C', 'D', 'E'};
        String s3 = new String(chs);
        System.out.println("s3:" + s3);

        System.out.println("--------");
        byte[] b = {97,98,99,100};
        String s4 = new String(b);
        System.out.println("s4:"+s4);

        System.out.println("--------");
        String s5 = new String(b,1,2);
        System.out.println("s5:"+s5);

        System.out.println("--------");
        String s6 = "abcd";
        System.out.println("s6:" + s6);



    }
}
