package com.atguigu.study05;
/*一、循环结构的四个要素
 * 1.初始化条件
 * 2.循环条件————>boolean类型
 * 3.循环体
 * 4.迭代条件
 *
 * 二、while循环的结构
 *
 * 1.
 * while( 2. ){
 * 		3.;
 * 		4.;
 * }
 *
 * 执行过程：1.———>2. 3. 4.————>2. 3. 4.———> ...—>2
 *
 * 说明：
 * 1.写while循环时千万小心不要丢了迭代条件。一旦丢失，就有可能导致死循环!
 * 2.我们写程序，要避免出现死循环。
 * 3.for循环和while循环是可以相互转换的
 * 	  区别:for循环和while循环的初始化条件部分的作用域不同
 *
 * 算法: 有限性
 *
 * */
public class while02 {

    public static void main(String[] args) {

        //遍历100以内的偶数
        int i = 1;
        while(i <= 100) {

            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }


    }
}
