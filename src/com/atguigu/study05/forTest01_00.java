package com.atguigu.study05;
/*
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数
 * 比如：12和20的最大公约数是4，最小公倍数是60
 *
 * 说明：break关键字的使用
 *
 * */
import java.util.Scanner;

public class forTest01_00 {

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.println("请输入第一个正整数:");
        int m = sc.nextInt();

        System.out.println("请输入第二个正整数:");
        int n = sc.nextInt();

        //获取最大公约数
        //1.获取两个数中的较小值
        int min = (m <= n)? m : n;
        //2.遍历
        for(int i = min ; i >= 1 ; i--) {
            if(m % i == 0 && n % i == 0) {
                System.out.println("最大公约数为:" + i);
                break ;// 一旦在循环中执行到break，就跳出循环
            }
        }


        //获取最小公倍数
        //1.获取两个数中的较大值
        int max = (m >= n)?m : n;
        //2.遍历
        for(int i = max ; i <= m*n ;i++) {
            if(i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数为:" + i);
                break;
            }
        }

    }
}