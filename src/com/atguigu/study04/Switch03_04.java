package com.atguigu.study04;
/*
 * ˵����
 * 1.���ǿ���ʹ��switch-case�Ľṹ��������ת��Ϊif-else����֮��������
 * 2.������֧�ṹʱ�������ּȿ���ʹ��switch-case��ͬʱ��switch�б��ʽ��ȡֵ�����̫�ࣩ
 *   �ֿ���ʹ��if-elseʱ����������ѡ��ʹ��switch-case��ԭ��switch-caseִ��Ч���Ը�
 *
 * */
import java.util.Scanner;

public class Switch03_04 {

    public static void main(String[] args) {
        //�Ӽ��̷ֱ������꣬�£��գ��ж���һ���ǵ���ĵڼ���
        //ע�⣺�ж�һ���Ƿ�Ϊ����ı�׼
        //���Ա�4�������������Ա�100�������ܱ�400����

        Scanner sc = new Scanner(System.in);
        System.out.println("��������");
        int year = sc.nextInt();
        System.out.println("��������");
        int month1 = sc.nextInt();
        System.out.println("��������");
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
                System.out.println("��");
                break;
            case 1:
                System.out.println("��");
                break;
            case 2:
                System.out.println("��");
                break;
            case 3:
                System.out.println("��");
                break;
            case 4:
                System.out.println("��");
                break;
            case 5:
                System.out.println("ţ");
                break;
            case 6:
                System.out.println("��");
                break;
            case 7:
                System.out.println("��");
                break;
            case 8:
                System.out.println("��");
                break;
            case 9:
                System.out.println("��");
                break;
            case 10:
                System.out.println("��");
                break;
            case 11:
                System.out.println("��");
                break;
        }

    }
}