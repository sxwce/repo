package com.hkx.homeWork.day06.demo7;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        if (arr == null){
            System.out.println("null");
        }else {
            System.out.println(getNum(arr));
        }
    }
    public static String getNum(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1){
                sb.append(arr[i]).append(", ");
            }else{
                sb.append(arr[i]).append("]");
            }
        }
        return sb.toString();
    }
}

