package com.atguigu.study02;
/*
 * String 类型变量的使用
 * 1. String类型属于引用数据类型，翻译为：字符串
 * 2. 声明String 类型的变量时，使用一对""
 * 3. String可以和8种基本数据类型变量做运算，且运算只能是连接运算: +
 * 4. 运算的结果仍然是String类型
 *
 * */
/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-15:34
 */
public class String03 {

    public static void main(String[] args) {

        String s1 = "Hello world";
        System.out.println(s1);

        String s2 = "a";
        String s3 = "";
        //char c = ''; 编译不通过

        //************************************
        int number = 1001;
        String numberStr = "学号: ";
        String info = numberStr + number ;// 连接运算: + ; 表示字符串的拼接
        boolean b1 = true ;
        String info1 = info + b1;// 连接运算: + ; 表示字符串的拼接
        System.out.println( info1 );

        //************************************
        //练习1
        char c = 'a'; //97   A:65
        int num = 10;
        String str = "Hello" ;
        System.out.println(c + num + str); //107Hello
        System.out.println(c + str + num); //aHello10
        System.out.println(c + (num + str)); //a10Hello
        System.out.println((c + num) + str); //107Hello
        System.out.println(str + num + c); //Hello10a

        //练习2
        //下面哪个可以打印出*	*
        System.out.println("*	*");//Y
        System.out.println('*' + '\t' + '*');//N
        System.out.println('*' + "\t" + '*');//Y
        System.out.println('*' + '\t' + "*");//N
        System.out.println('*' + ('\t' + "*"));//Y

        //如果出现String类型那么全部运算完后结果依然是String类型
        //要判断 + 号到底表达的是哪一种运算 先看进行运算的两个数据的数据类型
        //如果先进行运算的数据都是基本数据类型，那么 + 号 表示的是运算符号，进行加法运算
        //如果先进行运算的数据中某一个是String类型，那么 + 号 表示的是拼接符号，进行连接运算

        //**************************************************

        //String str1 = 123; // 编译不通过，声明String类型时 一定要用""
        String str1 = 123 + ""; // + 号表示的是一种连接运算，结果是一个String类型
        System.out.println( str1 );//"123" 表示的是字符串123

        //int num1 = str1; 数据类型不同依然不行
        //int num1 = (int)str1; 这种写法依然不对，无法进行强制转换

        //提供一种String 转 int 的方法
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);//123 表示的是实际的数123

    }

}
