package com.atguigu.study04;
/*
 * For循环结构的使用
 * 一、循环结构的4个要素
 * 1.初始化条件
 * 2.循环条件 ———> 是boolean类型的
 * 3.循环体
 * 4.迭代条件
 *
 * 二、For循环的结构
 *
 * for( 1. ; 2. ; 4. ){
 * 		 3.
 * }
 *
 * 执行过程：1.————————————>2. ——>3. ——>4.———————————>2.——>3.——>4.—————————>... ...————>2.
 *
 * */

public class For04_00 {
    public static void main(String[] args) {

//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		. . .

        for(int i = 0;i < 5 ; i++) {
            System.out.println("Hello World!");
        }
        // i:定义在for循环内，只在for循环内有效，出了for循环就失效了

        //练习:
        int num = 1;
        for(System.out.print('a') ; num <=3 ;System.out.print('c'),num++) {
            System.out.print('b');
        }
        //输出结果：abcbcbc

        System.out.println();

        //例题：遍历100以内的偶数，输出所有的偶数的和,输出偶数的个数
        int sum = 0; //定一个变量用来记录所有偶数的和
        int count = 0; //记录偶数的个数
        for(int i = 1;i <= 100; i++) {

            if(i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }
        System.out.println();
        System.out.println("总和为：" + sum);
        System.out.println("偶数的个数为" + count);

    }
}
