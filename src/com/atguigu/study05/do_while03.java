package com.atguigu.study05;
/*一、循环结构的四个要素
 * 1.初始化条件
 * 2.循环条件————>boolean类型
 * 3.循环体
 * 4.迭代条件
 *
 * 二、do—while循环的结构：
 *
 * 1.
 * do{
 * 		3.;
 * 		4.;
 * }
 * while( 2. )
 *
 * 执行过程:1.————>3.4.2.————>3.4.2.————>...——>2.
 *
 * 说明:
 * 1.do—while循环至少会执行一次循环体!
 *
 * */

public class do_while03 {

    public static void main(String[] args) {

        //遍历100以内的偶数
        int num = 1;
        int sum = 0; //记录总和
        int count = 0; //记录个数
        do {
            if(num % 2 == 0) {
                System.out.println(num);
                sum += num;
                count++;
            }
            num++;
        } while(num <= 100);

        System.out.println("总和为 " + sum);
        System.out.println("个数为 " + count);

        //****************************************
        //do-while至少会执行一次循环体

        int number1 = 10;
        while(number1 > 10) {
            System.out.println("helle while");
            number1--;
        }

        int number2 = 10;
        do {
            System.out.println("hello do-while");
            number2--;
        }
        while(number2 > 10);
    }

}
