package com.atguigu.study04;

import java.util.Scanner;

/*
 * 例题:对学生成绩大于60分的，输出“及格”，低于60分的，输出“不合格”。
 *
 * 说明:如果switch-case结构中的多个case的执行语句相同，则可以考虑进行合并。case穿透
 * */

public class Switch03_02 {

    public static void main(String[] args) {

        int score = 78;
        switch(score / 10){
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("不及格");
                break;
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 :
                System.out.println("及格");
                break;
        }

        //更优的解决方案
        switch(score / 60) {
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
        }

        //根据指定月份，打印该月份所属的季节，3，4，5春季、6，7，8夏季、9，10，11秋季、12，1，2冬季
        int month1 = 2;
        switch(month1) {
            case 3 :
            case 4 :
            case 5 :
                System.out.println("春季");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("夏季");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("秋季");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("冬季");
                break;
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("month");
        int month = sc.nextInt();
        System.out.println("day");
        int day = sc.nextInt();

        switch(month) {
            case 1 :
                System.out.println("2019第" + day + "天");
                break;
            case 2 :
                System.out.println("2019第" + (31+day) + "天");
                break;
            case 3 :
                System.out.println("2019第" + (31+28+day) + "天");
                break;
            case 4 :
                System.out.println("2019第" + (31*2+28+day) + "天");
                break;
            case 5 :
                System.out.println("2019第" + (31*2+30+28+day) + "天");
                break;
            case 6 :
                System.out.println("2019第" + (31*3+30+28+day) + "天");
                break;
            case 7 :
                System.out.println("2019第" + (31*3+30*2+28+day) + "天");
                break;
            case 8 :
                System.out.println("2019第" + (31*4+30*2+28+day) + "天");
                break;
            case 9 :
                System.out.println("2019第" + (31*5+30*2+28+day) + "天");
                break;
            case 10 :
                System.out.println("2019第" + (31*5+30*3+28+day) + "天");
                break;
            case 11 :
                System.out.println("2019第" + (31*6+30*3+28+day) + "天");
                break;
            case 12 :
                System.out.println("2019第" + (31*6+30*4+28+day) + "天");

        }

    }

}
