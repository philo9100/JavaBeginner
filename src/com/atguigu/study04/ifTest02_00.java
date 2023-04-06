package com.atguigu.study04;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-16:26
 */
/*
 * 岳小鹏参加Java考试，他和父亲岳不群达成承诺：
 * 如果：
 * 成绩为100分时，奖励一台BMW；
 * 成绩为(80,99]时，奖励一台iphone xs max；
 * 当成绩为[60,80]时，奖励一台ipad；
 * 其他成绩，什么奖励都没有。
 * 请从键盘输入越小彭的期末成绩，并加以判断
 *
 * 说明：
 * 1.else结构是可选的，根据实际情况可以不写
 * 2.针对条件表达式：
 *  >如果多个条件表达式之间是“互斥”关系（没有交集的关系），这些判断和执行语句，执行的先后顺序无所谓
 *  >如果多个条件表达式之间有交集的关系，需要根据实际情况，考虑清楚应该将哪个判断和执行结构写在前面
 *  >如果多个条件表达式之间有包含的关系，通常情况下，需要将范围小的声明在范围大的上面。否则范围小的
 *   就没有机会执行了
 *
 * */

import java.util.Scanner;

public class ifTest02_00 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入越小彭的期末成绩:(0-100)");
        int score = scan.nextInt();

        if(score == 100) {
            System.out.println("奖励一辆BMW");
        }
        else if(score > 80 && score <= 99 ) {
            System.out.println("奖励一台iphone xs max");
        }
        else if(score >= 60 && score <= 80) {
            System.out.println("奖励一个 ipad");
        }
        else {
            System.out.println("什么奖励也没有");
        }

    }

}