package com.hkx.homeWork.day05.demo2;

public class demo {

//    class Outside {

        public void show() {

            final int a = 10;

            class Inside {

                public void show() {

                    System.out.println("a:" + a);//10

                }
            }

            //创建内部类对象并调用show方法
            Inside inside = new Inside();
            inside.show();

        }

//    }
}

