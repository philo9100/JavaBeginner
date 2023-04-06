package com.atguigu.study05;
public class Test07 {

    public static void main(String[] args) {

        /*
         * 一个数如果恰好等于他的因子之和，这个数就被称为“完数”。例如：6 = 1 + 2 + 3
         * 编程 找到1000之内的所有完数（因子：除去这个数本身的其他约数）
         * */
        int sum = 0;

        for(int i = 1 ; i <= 1000 ; i++) {

            for(int j = 1 ; j <= i / 2 ; j++) {

                if(i % j == 0) {
                    sum += j;
                }
            }

            if(sum == i) {
                System.out.println(i);
            }

            //重置sum
            sum = 0;

        }

        /*输出图形*/
        for(int i = 0 ; i < 6 ; i++) {

            for(int j = i ; j < 6 ; j++) {

                System.out.print("*");
            }

            System.out.println();

        }

    }

}
