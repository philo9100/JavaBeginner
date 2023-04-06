package com.atguigu.study04;
/*
 * 说明：
 * 1.凡是可以使用switch-case的结构，都可以转换为if-else，反之，不成立
 * 2.遇到分支结构时，当发现既可以使用switch-case（同时，switch中表达式的取值情况不太多）
 *   又可以使用if-else时，我们优先选择使用switch-case。原因：switch-case执行效率稍高
 *
 * */
import java.util.Scanner;

public class Switch03_04 {

    public static void main(String[] args) {
        //从键盘分别输入年，月，日，判断这一天是当年的第几天
        //注意：判断一年是否为闰年的标准
        //可以被4整数，但不可以被100整除或能被400整除

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年");
        int year = sc.nextInt();
        System.out.println("请输入月");
        int month1 = sc.nextInt();
        System.out.println("请输入日");
        int day1 = sc.nextInt();

        int biaoZhun1 = year % 4 ;
        int biaoZhun2 = year % 100;

        int sumDays1 = 0;
        switch(month1) {
            case 12:
                sumDays1 += 30;
            case 11:
                sumDays1 += 31;
            case 10:
                sumDays1 += 30;
            case 9:
                sumDays1 += 31;
            case 8:
                sumDays1 += 31;
            case 7:
                sumDays1 += 30;
            case 6:
                sumDays1 += 31;
            case 5:
                sumDays1 += 30;
            case 4:
                sumDays1 += 31;
            case 3:
                if((biaoZhun1 == 0 && biaoZhun2 != 0) || year % 400 == 0) {
                    sumDays1 += 29;
                }
                else {
                    sumDays1 += 28;
                }
            case 2:
                sumDays1 += 31;
            case 1:
                sumDays1 += day1;
        }
        System.out.println(sumDays1);


        switch(year % 12) {
            case 0:
                System.out.println("猴");
                break;
            case 1:
                System.out.println("鸡");
                break;
            case 2:
                System.out.println("狗");
                break;
            case 3:
                System.out.println("猪");
                break;
            case 4:
                System.out.println("鼠");
                break;
            case 5:
                System.out.println("牛");
                break;
            case 6:
                System.out.println("虎");
                break;
            case 7:
                System.out.println("兔");
                break;
            case 8:
                System.out.println("龙");
                break;
            case 9:
                System.out.println("蛇");
                break;
            case 10:
                System.out.println("马");
                break;
            case 11:
                System.out.println("羊");
                break;
        }

    }
}