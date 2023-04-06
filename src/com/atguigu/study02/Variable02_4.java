package com.atguigu.study02;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-15:31
 */
public class Variable02_4 {

    public static void main(String[] args) {
        // 1.编码情况1:

        long l = 123321; //数据后面没有加L而编译通过
        System.out.println(l);
        //说明数据没有超过int类型的范围，默认把一个int类型的数据自动赋给long类型

        //long l1 = 254878998745875642; // 编译失败: 过大的整数，超过int的范围不能再默认为int
        //只能使用long类型来接收，要加L
        long l1 = 254878998745875642L;


        //编译失败
        //float f1 = 12.3 ; 没有加f默认是double类型的，而double类型的的数据无法自动赋给float

        //**************************************************************************************

        // 2.编码情况2:

        //整型常量，默认类型是int型
        //浮点型常量，默认类型是double型

        byte b = 12;
        //byte b1 = b + 1;//编译失败，1默认是一个int类型的常量运算后不能赋给byte类型

        //float f1 = b + 12.3;//编译失败，12.3默认是一个double类型的常量运算后不能赋给float类型

    }

}
