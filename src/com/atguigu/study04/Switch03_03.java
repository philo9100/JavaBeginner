package com.atguigu.study04;

import java.util.Scanner;

public class Switch03_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("month");
        int month = sc.nextInt();
        System.out.println("day");
        int day = sc.nextInt();

        //̫������
        switch(month) {
            case 1 :
                System.out.println("2019��" + day + "��");
                break;
            case 2 :
                System.out.println("2019��" + (31+day) + "��");
                break;
            case 3 :
                System.out.println("2019��" + (31+28+day) + "��");
                break;
            case 4 :
                System.out.println("2019��" + (31*2+28+day) + "��");
                break;
            case 5 :
                System.out.println("2019��" + (31*2+30+28+day) + "��");
                break;
            case 6 :
                System.out.println("2019��" + (31*3+30+28+day) + "��");
                break;
            case 7 :
                System.out.println("2019��" + (31*3+30*2+28+day) + "��");
                break;
            case 8 :
                System.out.println("2019��" + (31*4+30*2+28+day) + "��");
                break;
            case 9 :
                System.out.println("2019��" + (31*5+30*2+28+day) + "��");
                break;
            case 10 :
                System.out.println("2019��" + (31*5+30*3+28+day) + "��");
                break;
            case 11 :
                System.out.println("2019��" + (31*6+30*3+28+day) + "��");
                break;
            case 12 :
                System.out.println("2019��" + (31*6+30*4+28+day) + "��");
        }


        //������
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
