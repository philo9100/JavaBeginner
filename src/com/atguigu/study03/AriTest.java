package com.atguigu.study03;
/*
 * 练习：随意给出一个三位数的整数x，打印显示它的个位数、十位数、百位数的值
 * 格式如下：
 * 个位数: int ge = x % 10;
 * 十位数: int shi = x / 10 %10; 或者 int shi = x % 100 / 10;
 * 百位数: int bai = x/100;
 *
 * */
/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-15:42
 */
public class AriTest {

    public static void main(String[] args) {

        int x = 189;

        int ge = x % 10;
        int shi = x / 10 %10; //或者 int shi = x % 100 / 10;
        int bai = x/100;

        System.out.println(x+"的百位是："+bai+"，十位是："+shi+"，个位是："+ge);

    }

}
