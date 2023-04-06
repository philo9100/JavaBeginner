package com.atguigu.study04;

import java.util.Scanner;

public class For04_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("m n");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.print(m + "和" + n+ "的公约数有 ");
        int max = 1;
        for(int i = 1 ; i <= 100 ; i++) {
            if(m % i == 0 && n % i == 0) {
                if(max <= i)
                    max = i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("最大公约数为 " + max);

        int min = m*n ;
        for(int i = 1 ; i <= 1000 ; i++) {

        }

    }

}