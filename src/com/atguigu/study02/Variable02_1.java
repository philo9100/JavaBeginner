package com.atguigu.study02;
/*
 * java定义的数据类型
 *
 * 一、变量按照数据类型来分：
 *
 *		基本数据类型：
 *			整形：byte \short \int \long
 *			浮点型：float \double
 *    		字符型：char
 *    		布尔型：boolean
 *
 *		引用数据类型：
 *			类（class）
 *			接口（interface）
 *			数组（array）
 *
 * 二、变量在类中声明的位置
 * 			成员变量	 VS	局部变量
 *
 * */
/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-14:58
 */
public class Variable02_1 {

    public static void main(String[] args) {

        //1.整型：byte（1字节=8bit）\short（2字节）\int（4字节）\long（4字节）
        //①byte范围：-128 ～ 127
        byte b1 = 12;
        byte b2 = -128;
        // b2 = 128; 编译不通过
        System.out.println(b1);
        System.out.println(b2);

        //②声明long类型变量，必须以 "L" 或 "l" 结尾
        //③通常：定义整型变量时，使用 int 型
        short s1 = 128;
        int i1 = 1234;
        long l1 = 365487945875454l;
        System.out.println(l1);

        //2. 浮点型：float(4字节) \ double(8字节)
        //① 浮点型, 表示带小数点的数值
        //② float 虽然占4个字节但是表示数值的范围比 long还大

        double d1= 123.3;
        System.out.println(d1);
        //③ 定义float类型变量时，变量要以"f"或"F"结尾
        float f1 = 12.3f;
        System.out.println(f1);
        //④ 通常：定义浮点型变量时，使用double型。

        //****************************************************************
        //3.字符型：char (1字符=2字节)
        //① 定义char型变量，通常使用一对''，内部只能写一个字符
        char c1 = 'a';
        // 编译不通过
        //c1 = 'AB';
        System.out.println(c1);

        char c2 = '1';
        //char c3 = '中';
        //char c4 = 'ば';
        System.out.println(c2);
        //System.out.println(c3);
        //System.out.println(c4);

        //② 表示方法：1.声明一个字符 2.转义字符 3.直接使用Unicode 值来表示字符型常量
        char c5 = '\n';//换行符
        c5 = '\t';//制表符
        System.out.print("Hello" + c5);
        System.out.println("World");

        char c6 = '\u0043'; // 课件第二章基本语法里有 CodeCharts 对应的Unicode编码集
        System.out.println(c6);

        //声明char类型不加 '' 的情况
        char c7 = 97; // 直接使用字符所对应的阿斯克码，开发中很少见

        char c8 = 5;
        char c9 = '5';//这两种不是同一个情况，不加''的5对应的是阿斯克码为5的一个字符
        //加''的5，表示的是5这个字符，而其对应的阿斯克码不是5
        int i = (int) c9;
        System.out.println(i); //53


        //4. 布尔型：boolean
        //① 只能取两个值之一：true 、false
        //② 常常在条件判断、循环结构中使用
        boolean bb1 = true ;
        System.out.println(bb1 );

        boolean isMarried = true ;
        if(isMarried) {
            System.out.println("你就不能参加\"单身\"party了 ！\n很遗憾 ");
        }
        else {
            System.out.println("你可以多谈谈女朋友 ！");
        }

        //引用数据类型之后会讲到

    }

}
