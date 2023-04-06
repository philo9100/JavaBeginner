package com.atguigu.study01;
/*
 * 1.java规范了三种注释方式
 * 单行注释
 * 多行注释
 * 文档注释
 *
 * 2.单行注释和多行注释的作用:
 * ①对所写的程序进行解释说明，增强可读性，方便自己，方便别人理解代码的意思
 * ②调试所写的代码，帮助我们找到出错的代码
 *
 * 3.特点:
 * 单行注释和多行注释，注释了的内容不参与编译
 * 换句话说，编译生成的.class结尾的字节码文件中不包含注释的内容
 *
 * 4.文档注释的作用:
 *  注释的内容可以被JDK提供的工具javadoc所解析，生成一套以网页文件形式
 *  体现的该程序的说明文档
 *
 *  命令提示符用javadoc解析的方式
 *  指向文件所在的路径> javadoc  -d   起一个文件夹的名字  -author  -version  文件名.java
 *  运行后会在路径下产生成一个所起名字的文件夹，文件夹内有一个index.html的网页文件
 *  打开就会看到文档注释的内容
 *
 *  5.多行注释不可以嵌套使用
 *
 * */
/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2022-07-03-14:46
 */
public class Comment01 {

    /*
     *多行注释:
     *如下的main方法是程序的入口
     *main方法的格式是固定的
     * */
    public static void main(String[] args) {

        //单行注释:如下的语句表示输出到控制台
        System.out.println("Hello World!");

    }
}
