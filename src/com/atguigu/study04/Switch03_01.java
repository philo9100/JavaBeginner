package com.atguigu.study04;

import java.util.Scanner;

public class Switch03_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("������Сд��ĸ��a-e��");
        String word = sc.next();
        char wordIn = word.charAt(0); //�ַ������Ϳ���ֱ�ӴӼ��������룬�ַ�����û���Ӽ�����ֱ������
        //�����ַ����Ϳ��Ի�ȡ�Ӽ�����¼����ַ�������λ���ϵ��ַ�
        switch(wordIn) {
            case 'a' :
                System.out.println("A");
                break;
            case 'b' :
                System.out.println("B");
                break;
            case 'c' :
                System.out.println("C");
                break;
            case 'd' :
                System.out.println("D");
                break;
            case 'e' :
                System.out.println("E");
                break;
            default :
                System.out.println("other");

        }


    }

}
