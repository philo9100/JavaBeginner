package com.atguigu.study04;


//1.导包： import.util.Scanner;
import java.util.Scanner;

/*
 * 如何从键盘获取不同类型的变量：需要使用Scanner类
 *
 * 具体实现步骤：
 * 1.导包： import.util.Scanner;
 * 2.Scanner的实例化：Scanner scan = new Scanner(System.in);
 * 3.调用Scanner类的相关方法（next()/nextXxx()），来获取指定类型的变量
 *
 * 注意：
 * 需要根据相应的方法，来输入指定的类型的值，如果输入的数据类型与要求的类型不匹配时，会报异常
 * InputMisMatchException 导致程序终止
 *
 */

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-16:24
 */
public class Scanner01 {

    public static void main(String[] args) {

        //2.Scanner的实例化：Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        //3.调用Scanner类的相关方法（next()/nextXxx()），来获取指定类型的变量
        System.out.println("请输入你的姓名");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的年龄");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否看上我了呢？(true/false)");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        //对于char类型的获取，Scanner 没有提供相关的方法。只能获取一个字符串
        System.out.println("请输入你的姓别：（男/女）");
        String gender = scan.next(); //"男"

        //如果非要用char类型类接收数据，String类提供了一个方法，获取字符串索引位置上的字符
        char genderChar = gender.charAt(0); //获取索引为0位置上的字符
        System.out.println(genderChar);

    }

}
