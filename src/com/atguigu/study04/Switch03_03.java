package com.atguigu.study04;

import java.util.Scanner;

public class Switch03_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("month");
        int month = sc.nextInt();
        System.out.println("day");
        int day = sc.nextInt();

        //太过冗余
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


        //方法二
        int sumDays = 0;
        switch(month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.println(sumDays);

    }
}
