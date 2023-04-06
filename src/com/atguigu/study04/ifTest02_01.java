package com.atguigu.study04;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-16:26
 */
/*
 * 编写程序：由键盘输入三个整数分别存入变量num1、num2、num3
 * 对它们进行排序(使用 if-else if-else)，并且从小到大输出
 *
 * 说明：
 * 1.if—else结构是可以嵌套使用的。
 * 2.如果if-else结构中的执行语句只有一行时，对应的一对{}可以省略。但是，不建议省略
 *
 * */

import java.util.Scanner;

public class ifTest02_01 {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个整数：");
        int num3 = scanner.nextInt();


        if(num1 >= num2) {
            if(num3 >= num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if(num3 <= num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        } else {
            if(num3 >= num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else if(num3 <= num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            } else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }


    }

}
