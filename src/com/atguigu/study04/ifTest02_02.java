package com.atguigu.study04;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-16:26
 */
import java.util.Scanner;

public class ifTest02_02 {

    public static void main(String[] args) {

        //练习1
        int x = 4;
        int y = 1;
        if(x > 2)
            if(y > 2)
                System.out.println(x + y);
            else //就近原则，与最近的if结构连接
                System.out.println("x = " + x);

        //练习2
        boolean b = true;
        if(b == false)
            System.out.println("a");
        else if(b) //if条件判断式默认为true
            System.out.println("b");
        else if(!b)
            System.out.println("c");
        else
            System.out.println("d");

        //********************************
        if(b = false) //if条件判断式可以把false赋给b，再进行判断
            System.out.println("a");
        else if(b) //if条件判断式默认为true
            System.out.println("b");
        else if(!b)
            System.out.println("c");
        else
            System.out.println("d");

        //********************************
        Scanner sc = new Scanner(System.in);
        //输入狗的年龄
        System.out.println("请输入狗的年龄");
        int dogAge = sc.nextInt();

        if(dogAge < 3 && dogAge >= 0) {
            System.out.println("狗的年龄相当于人的年龄是" + dogAge * 10.5 +"岁");
        }
        else if(dogAge >2) {
            System.out.println("狗的年龄相当于人的年龄是" + ((dogAge-2) *4 + 21) + "岁");
        }
        else {
            System.out.println("输入有误！");
        }

        //*********************************
        /*假设你想开发一个玩彩票的游戏，程序随机的产生一个两位数的彩票，提示用户输入
         * 一个两位数，然后按照下面的规则判定用户是否能赢
         * 1.如果用户输入的数匹配彩票的实际顺序，奖金10000美元
         * 2.如果用户输入的所有数字匹配彩票的所有数字，但顺序不一样，奖金3000美元
         * 3.如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1000美元
         * 4.如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元
         * 5.如果用户输入的数字没有匹配任何一个数字，则彩票作废
         *
         * 提示：获取指定范围内的随机数的公式：[a,b]: (int)(Math.random() * (b - a + 1) + a)
         *
         * 使用Math.random()产生随机数
         * Math.random()产生[0,1)范围的随机数
         * Math.random() * 90: [0,90)
         * Math.random() * 90 + 10: [10,100) 即得到 [10,99]
         * 使用(int)(Math.random() * 90 + 10)产生随机数
         * Math.random():[0,1) * 90  ——> [0,90) + 10 ——> [10,100) ——> [10,99]
         * */

        int suiJi = (int)(Math.random()*90 + 10);

        int suiJishi = suiJi / 10;
        int suiJige = suiJi % 10;

        System.out.println("请输入一个两位数");
        int shuRu = sc.nextInt();

        int shuRushi = shuRu / 10;
        int shuRuge = shuRu % 10;

        if(shuRu == suiJi) {
            System.out.println("中奖号码是：" + suiJi);
            System.out.println("奖金 10000 美元");
        }
        else if(suiJishi == shuRuge && suiJige == shuRushi) {
            System.out.println("中奖号码是：" + suiJi);
            System.out.println("奖金 3000 美元");
        }
        else if(suiJishi == shuRushi || suiJige == shuRuge) {
            System.out.println("中奖号码是：" + suiJi);
            System.out.println("奖金 1000 美元");
        }
        else if(suiJishi == shuRuge || suiJige == shuRushi) {
            System.out.println("中奖号码是：" + suiJi);
            System.out.println("奖金 500 美元");
        }
        else {
            System.out.println("中奖号码是：" + suiJi);
            System.out.println("没有中奖");
        }

    }

}
