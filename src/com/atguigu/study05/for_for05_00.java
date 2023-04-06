package com.atguigu.study05;
/*
 * 嵌套循环的使用
 * 1.嵌套循环:将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环
 *
 * 2.
 * 外层循环:循环结构B
 * 内层循环:循环结构A
 *
 * 3.说明:
 * ①.内层循环结构遍历一遍，只相当于外层循环循环体执行了一次
 * ②.假设外层循环需要执行 m 次，内层循环需要执行 n 次。此时内层循环的循环体一共执行了 m * n 次
 *
 * 4.技巧:
 * 	 外层循环控制行数，内层循环控制列数
 *
 * */
public class for_for05_00 {

    public static void main(String[] args) {

        //要求打印一个形状 ————> * * * * * *
        //可以直接输出 System.out.println("* * * * * *");
        //如果要求打印的 * 过多考虑使用循环
        for(int i = 1 ; i <= 6 ; i++) {
            System.out.print("* ");
        }

        System.out.println("\n");


        //现在要求打印一个形状如下
        /*

         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *

         */
        //可以考虑使用上面的循环结构打印四行
//		for(int i = 1 ; i <= 6 ; i++) {
//			System.out.print("* ");
//		}
//
//		System.out.println();
//
//		for(int i = 1 ; i <= 6 ; i++) {
//			System.out.print("* ");
//		}
//
//		System.out.println();
//
//		for(int i = 1 ; i <= 6 ; i++) {
//			System.out.print("* ");
//		}
//
//		System.out.println();
//
//		for(int i = 1 ; i <= 6 ; i++) {
//			System.out.print("* ");
//		}
//
//		System.out.println();

        //如果有多行时，可以考虑把使用循环结构

        for(int j = 1 ; j <=4 ; j++ ) {
            for(int i = 1 ; i <= 6 ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        /*           i(行号)       j(*的个数)

         * 			 1             1
         * *		 2             2
         * * *       3             3
         * * * *     4             4
         * * * * *   5             5

         */

        for(int i = 1 ; i <= 5 ; i++) { //控制行数
            for(int j = 1 ; j <= i ; j++) { //控制列数
                System.out.print("* ");
            }
            System.out.println();
        }



        /*           i(行号)       j(*的个数)  规律: i + j = 5 换句话说 :j = 5 - i;

         * * * *	 1             4
         * * *		 2             3
         * *         3             2
         *     		 4             1

         */

        for(int i = 1 ;i <= 4 ; i++) {
            for(int j = 1 ; j <= 5 - i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();

        //菱形
        //上半部分
        for(int i = 1 ; i <= 5 ;i++) {
            for(int j = 1 ; j <= 5 - i ; j++ ) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //下半部分
        for(int i = 1 ; i <= 4 ;i++) {
            for(int j = 1 ; j <= i ; j++ ) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= 5 - i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //心星

        for(int i = 1 ; i <= 4 ; i++) {
            for(int j = i ; j <= 4 ; j++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i+3 ; j++) {
                System.out.print("* ");
            }
            for(int j = i ; j <= 5 ; j++) {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i+3 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i = 1 ; i <= 3 ; i++) {
            for(int j = 1 ; j <= 17 ;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i = 1 ; i <= 8 ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("  ");
            }
            for(int j = i ; j <= 8 ; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }

    }

}
