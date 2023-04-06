package com.atguigu.study03;
/*
 * 运算符之四：逻辑运算符
 *
 * &	&&   |    ||	!	^
 *
 * 说明：
 * 1.逻辑运算符操作的都是boolean类型的变量
 *
 * */
/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-15:58
 */
public class Logic04 {
    public static void main(String[] args) {

        //区分& 与 &&
        //相同点1:& 与 && 的运算结果相同
        //相同点2: 当符号左边是true时，二者都会执行符号右边的运算
        //不同点: 当符号左边是false时，&继续执行符号右边的运算，&&不再执行符号右边的运算
        //开发中，推荐使用 &&
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)) { //区别在于&
            System.out.println("我现在在北京");
        }
        else {
            System.out.println("我现在在南京");
        }
        System.out.println("num1 = " + num1);


        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)) { //区别在于&&
            System.out.println("我现在在北京");
        }
        else {
            System.out.println("我现在在南京");
        }
        System.out.println("num2 = " + num2);



        //区分| 与 |
        //相同点1:| 与 || 的运算结果相同
        //相同点2: 当符号左边是false时，二者都会执行符号右边的运算
        //不同点: 当符号左边是true时，| 继续执行符号右边的运算，而 || 不再执行符号右边的运算
        //开发中，推荐使用 ||
        boolean b3 = false;
        b3 = true;
        int num3 = 10;
        if(b3 | (num3++ > 0)) { //区别在于 |
            System.out.println("我现在在北京");
        }
        else {
            System.out.println("我现在在南京");
        }
        System.out.println("num3 = " + num3);


        boolean b4 = false;
        b4 = true;
        int num4 = 10;
        if(b4 || (num4++ > 0)) { //区别在于 ||
            System.out.println("我现在在北京");
        }
        else {
            System.out.println("我现在在南京");
        }
        System.out.println("num4 = " + num4);


        //逻辑运算符练习
        int x = 1;
        int y = 1;
        if(x++ == 2 & ++y == 2) {
            x = 7;
        }
        System.out.println("x = "+ x +",y = " + y);//x = 2 , y = 2

        int x1 = 1, y1 = 1;
        if(x1++ == 2 && ++y1 == 2) {
            x1 = 7;
        }
        System.out.println("x1 = " + x1 + ",y1 = " + y1);//x1 = 2 , y1 = 1

        int x2 = 1, y2 = 1;
        if(x2++ == 1 | ++y2 == 1) {
            x2 = 7;
        }
        System.out.println("x2 = "+ x2 +",y2 = " + y2);//x2 = 7 , y2 = 2

        int x3 = 1;
        int y3 = 1;
        if(x3++ == 1 || ++y3 == 1) {
            x3 = 7;
        }
        System.out.println("x3 = "+ x3 +",y3 = " + y3);//x3 = 7, y3 = 1


        boolean x4 = true;
        boolean y4 = false;
        short z = 42;

        if((z++ == 42) && (y4 = true))z++;
        if((x4 = false) || (++z == 45))z++;

        System.out.println("z = " + z); // 46

    }
}
