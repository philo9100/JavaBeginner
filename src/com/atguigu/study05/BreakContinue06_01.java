package com.atguigu.study05;
/*
 * 关于质数的输出问题
 *
 * */
public class BreakContinue06_01 {

    public static void main(String[] args) {

        int count = 0;

        long start = System.currentTimeMillis();

        label: for(int i = 2 ; i <= 10000; i++) {

            for(int j = 2 ; j <= Math.sqrt(i) ; j++) {

                if(i % j == 0) {
                    continue label;
                }

            }
            //能执行到此步骤的都是质数。不能执行到此步骤的都不是质数，执行到if语句后跳过了当次循环
            count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("质数的个数为 " + count);
        System.out.println("所花费的时间为 " + (end - start) );

    }

}
