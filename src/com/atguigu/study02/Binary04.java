package com.atguigu.study02;
/*
 * 计算机中不同进制的使用说明
 *
 * 对于整数，有四种表示方式：
 * >二进制（binary）：0，1，以0b或者0B开头表示
 * >十进制（decimal）：0-9，满10进1.
 * >八进制（octal）：0-7，满8进1，以数字0开头表示
 * >十六进制（hex）：0-9及A-F，满16进1，以0x或者0X开头表示，此处的A-F不区分大小写。
 *					如：0x21AF+1 = 0x21b0
 * */
/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-15:39
 */
public class Binary04 {

    public static void main(String[] args) {

        int num1 = 0b110;
        int num2 = 110;
        int num3 = 0127;
        int num4 = 0x110a;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

    }

}
