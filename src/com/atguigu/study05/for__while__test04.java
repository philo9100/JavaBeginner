package com.atguigu.study05;
/*
 * 题目：
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
 *
 * 提示：因为读入的次数不确定，考虑使用 "无限" 循环的方法
 * 1.格式：
 * while(true)
 * for(  ;  ;  )
 * 无限循环存在的原因是并不知道循环多少次，需要根据循环体内部某些条件，来控制循环的结束
 *
 * 2.结束循环有几种方式
 * 方式一：循环条件部分返回 false
 * 方式二：在循环体中，执行break
 *
 * */

import java.util.Scanner;

public class for__while__test04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positiveNumber = 0;
        int negativeNumber = 0;

        System.out.println("请输入");
        while(true) {

            int number = sc.nextInt();

            //判断number正负的请况
            if(number > 0) {
                positiveNumber++;
            }
            else if(number < 0) {
                negativeNumber++;
            }
            else {
                //一旦执行到break，跳出循环
                break;
            }
        }
        System.out.println("正数的个数为 " + positiveNumber);
        System.out.println("负数的个数为 " + negativeNumber);

    }
}
