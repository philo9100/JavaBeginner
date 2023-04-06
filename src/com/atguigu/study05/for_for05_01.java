package com.atguigu.study05;
/*
 * 九九乘法表
 * */
public class for_for05_01 {

    public static void main(String[] args) {

        for(int i = 1 ; i <= 9 ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print(i + "*" + j + " = " + (i * j) + "   ");
            }
            System.out.println();
        }

    }

}
