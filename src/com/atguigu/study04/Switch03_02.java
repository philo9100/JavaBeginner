package com.atguigu.study04;

import java.util.Scanner;

/*
 * ����:��ѧ���ɼ�����60�ֵģ���������񡱣�����60�ֵģ���������ϸ񡱡�
 *
 * ˵��:���switch-case�ṹ�еĶ��case��ִ�������ͬ������Կ��ǽ��кϲ���case��͸
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
                System.out.println("������");
                break;
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 :
                System.out.println("����");
                break;
        }

        //���ŵĽ������
        switch(score / 60) {
            case 0:
                System.out.println("������");
                break;
            case 1:
                System.out.println("����");
                break;
        }

        //����ָ���·ݣ���ӡ���·������ļ��ڣ�3��4��5������6��7��8�ļ���9��10��11�＾��12��1��2����
        int month1 = 2;
        switch(month1) {
            case 3 :
            case 4 :
            case 5 :
                System.out.println("����");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("�ļ�");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("�＾");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("����");
                break;
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("month");
        int month = sc.nextInt();
        System.out.println("day");
        int day = sc.nextInt();

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

    }

}
