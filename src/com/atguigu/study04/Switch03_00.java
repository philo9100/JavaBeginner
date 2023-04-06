package com.atguigu.study04;
/*
 * 分支结构之二：switch-case
 *
 * 1.格式
 * switch ( 表达式 ){
 * case 常量1 :
 * 		执行语句1;
 * 		//break;
 *
 * case 常量2 :
 * 		执行语句2;
 * 		//break;
 *
 * . . . . . .
 *
 * default:
 * 		执行语句n;
 * 		//break;
 *
 * }
 *
 * 2.说明:
 * ①根据switch表达式中的值，依次匹配各个case中的常量
 * 一旦匹配成功，则进入相应的case结构中，调用其执行语句。
 * 当调用完执行语句以后，与if-else结构不同的是if-else不会再执行下面的语句，而是跳出分支结构
 * 而switch仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字或此switch-case结构
 * 末尾结束为止。
 *
 * ②break,可以使用在switch-case结构中，表示一旦执行到此关键字，就跳出switch-case结构
 *
 * ③switch结构中的表达式，只能是如下的6种数据类型之一：
 * 		byte、short、char、int、枚举类型（JDK5.0新增）、String类型（JDK7.0新增）
 *
 * ④ case 之后只能声明常量。不能声明范围
 *
 * ⑤ break关键字是可选的，根据实际写还是不写
 *
 * ⑥ default : 相当于if-else结构中的else
 * 				default结构是可选的
 * 				default 的结构可以移动，默认都是写到最后并且不加break语句
 *
 * */

public class Switch03_00 {

    public static void main(String[] args) {

        int number = 1;
        switch (number) {
            case 0 :
                System.out.println("zero");
                break;
            case 2 :
                System.out.println("one");
                break;
            case 3 :
                System.out.println("two");
                break;
            default :
                System.out.println("other");
                //break;
        }

        String season = "summer";
        switch(season) {
            case "spring" :
                System.out.println("春暖花开");
                break;
            case "" :
                System.out.println("夏日炎炎");
                break;
            case "summer" :
                System.out.println("秋高气爽");
                break;
            case "autumn" :
                System.out.println("冬雪皑皑");
                break;
            default :
                System.out.println("季节输入有误");
                //break;
        }

        //****************如下的两种情况都编译不通过*******************

        //情况一
//		boolean isHandsome = true;
//		switch(isHandsome) {
//		case true :
//		System.out.println("我好帅");
//		break;
//		case false :
//		System.out.println("我好丑");
//		break;
//		default :
//		System.out.println("输入有误"); }
//		//break;

        //情况二
//		int age = 10;
//		switch(age) {
//		case age > 18:
//			System.out.println("成年了");
//			break;
//		default :
//			System.out.println("未成年");
//		//break;
//		}

    }

}
