package com.atguigu.study02;
/*像JS声明变量类型时统一用var，进行运算时自动识别转换变量的类型，这种称之为弱类型
  而像Java声明变量类型时，每种变量都要指出他的数据类型，这种称为强类型
  显然从语法上看java更严谨
 *
 * 变量的使用
 * 1.java定义变量的格式：数据类型 变量名 = 变量值;
 *
 * 2.说明：
 *   ①变量必须先声明，赋值后，才可以使用
 *   ②变量都定义在其作用域内。在作用域内，它是有效的。换句话说，出了作用域，就失效了
 *   ③同一个作用域内，不可以声明同一个变量名
 *
 * */
/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-14:56
 */
public class Variable02_0 {

    public static void main(String[] args) {

        //变量的定义
        int myAge=12;
        //变量的使用
        System.out.println(myAge);

        //int myAge=22; 编译错误 同一个作用域内，不可以声明同一个变量名


        //编译错误：使用myNumber之前并未定义过myNumber
        //System.out.println(myNumber);

        //变量的声明
        int myNumber;

        //编译错误：使用myNumber之前并未赋值过myNumber
        //System.out.println(myNumber);

        //变量的赋值
        myNumber=1001;

        System.out.println(myNumber);

    }

}
