package com.atguigu.study03;
/*
 * 运算符之五：位运算符（了解）
 *
 * 结论：
 * 1.位运算符操作的都是整型的数据
 * 2.<<:在一定范围内，每向左移1位，相当于*2
 * 	 >>:在一定范围内，每向右移1位，相当于/2
 *
 * 面试题：最高效方式的计算2 * 8？ 答：2 << 3 或 8 << 1
 */
/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-16:06
 */
public class Bit05 {

    public static void main(String[] args) {

        int i = 21;

        System.out.println(i + " << 2 = " + (i << 2));
        System.out.println(i + " << 3 = " + (i << 3));
        System.out.println(i + " << 27 = " + (i << 27));//在一定范围内，超过一定范围
        //左移位从0变成1，即最高位就会变成1
        //最高位为1也就变成一个负数
        //int i = -21; 负数一致

        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);

        //方式一：定义临时变量的方式
        //推荐的方式
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;

        //方式二
        //好处：不用定义临时变量
        //弊端：①相加操作可能超出存储范围 ②有局限性：只能适用于数值类型
//		num1 = num1 + num2;
//		num2 = num1 - num2;
//		num1 = num1 - num2;

        //方式三：使用位运算符
        num1 = num1 ^ num2; //先将num1 ^ num2 的值赋给 num1，此时的num1 = num1 ^ num2
        num2 = num1 ^ num2; //再把num1 ^ num2 ，即(num1 ^ num2) ^ num2 = num1 赋给 num2
        //此时num2的值是最开始num1的值
        num1 = num1 ^ num2; //最后num1 ^ num2 ，即(num1 ^ num2) ^ num1 = num2 赋给 num1
        //此时num1的值是最开始num2的值
        System.out.println("num1 = " + num1 + ",num2 = " + num2);


        //实现十进制的60转换成十六进制的60即3c

        int i1 = 60 ;
        int i2 = i1 & 15;
        String j = (i2 > 9)?(char)(i2 - 10 + 'A') + "" : i2 + "";

        int temp = i1 >>> 4;
        i2 = temp & 15;
        String k = (i2 > 9)?(char)(i2 - 10 + 'A') + "" : i2 + "";

        System.out.println(k + "" + j);

    }

}
