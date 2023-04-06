package com.atguigu.study02;
/*
 * 	强制类型转换:自动类型提升的逆运算。
 *  1.需要使用强转符: ()
 *  2.注意点： 强制类型转换，可能导致精度损失
 *
 * */
/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-15:14
 */
public class Variable02_3 {

    public static void main(String[] args) {

        double d1 = 12.9;
        //精度损失举例1
        int i1 = (int) d1;//截断操作
        System.out.println( i1 );

        //没有精度损失 long型变量l1所赋值的大小没有超过short类型变量s2的范围
        long l1 = 123L;
        short s2 = (short) l1;

        //精度损失举例2
        int i2 = 128;
        byte b = (byte) i2;
        System.out.println( b ); // -128 具体原因要根据计算机底层二进制来讲

        //-127的二进制补码是1000 0001，则-128的二进制补码是1000 0000
        //+128的二进制是0000 0000 1000 0000占两个字节，强制转换成一个字节的byte则会把前面的一个字节
        //去掉变成1000 0000 即是-128
    }

}
