package com.atguigu.study03;
/*
 * 运算符之一：算术运算符
 * (正)+  (负)-	   + - * / %    (前)++ (后)++ (前)-- (后)--   (连接)+
 *
 * */
/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-15:43
 */
public class Ari01 {

    public static void main(String[] args) {

        //除号：/
        int num1 = 12;
        int num2 = 5;

        int result1 = num1/num2;
        System.out.println(result1); //2 两个int类型的数据运算完依然是int类型省去小数部分

        int result2 = num1 / num2 * num2;
        System.out.println(result2); //10 程序是从左往右读的

        double result3 = num1/num2;
        System.out.println(result3); //2.0 同上，结果是int类型，若用double接收会多出一个.0

        double result4 = num1 / num2 + 0.0; //2.0

        double result5 = num1 / (num2 + 0.0); //2.4 先计算括号内的自动类型提升int转double变成5.0
        //整体运算后int转double是12.0 / 5.0，结果为double类型的
        double result6 = (double)num1 / num2; //2.4 原理同上只是写法不同
        System.out.println(result5 +" "+ result6);

        // %：取余运算
        //结果的符号与被模数的符号相同
        //开发中，经常使用%来判断能否被除尽的情况   先不看符号运算被模数为负结果就为负
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1 =" + m1 % n1);

        int m2 = -12;
        int n2 = 5;
        System.out.println("m2 % n2 =" + m2 % n2);

        int m3 = 12;
        int n3 = -5;
        System.out.println("m3 % n3 =" + m3 % n3);

        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4 =" + m4 % n4);


        //(前)++ :先自增1，后运算
        //(后)++ :先运算，后自增1
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = "+a1+",b1 = "+ b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = "+a2+",b2 = "+ b2);

        int a3 = 10;
        ++a3; // a3++;
        int b3 = a3; //不论是++a3 还是a3++都是自增1，而没有赋值运算
        //赋值运算是单独进行的，此时a3++与++a3表示的含义一样

        //注意点：
        short s1 = 10;
        //s1 = s1 + 1;  编译失败，常量1默认是int类型的运算完后是int类型的
        //s1 = (short) (s1 + 1); 编译成功
        s1++; // 自增1不会改变变量本身的数据类型
        System.out.println(s1);
        //由此见得，自增1运算比普通+1运算的效率要高

        //问题：
        byte bb1 = 127;
        bb1++;
        System.out.println("bb1 = "+bb1); // -128   byte占1个字节 127是0111 1111
        //自增1运算不改变数据类型byte
        //依然占1个字节 就变成1000 0000 即-128


        //(前)--
        //(后)--
        int a4 = 10;
        int b4 = a4--; // b4 = 10 , a4 = 9
        b4 = --a4; // b4 = 9 , a4 = 9

    }

}
