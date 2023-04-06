package com.atguigu.study04;

import java.util.Scanner;

public class Switch03_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入小写字母（a-e）");
        String word = sc.next();
        char wordIn = word.charAt(0); //字符串类型可以直接从键盘上输入，字符类型没法从键盘上直接输入
        //但是字符类型可以获取从键盘上录入的字符串索引位置上的字符
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
