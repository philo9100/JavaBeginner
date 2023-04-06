package com.atguigu.study05;
/*
 * break 和 continue 关键字的使用
 *
 * 					适用范围				循环中使用的作用(不同点)		相同点
 *
 * break : 			switch-case
 * 					循环结构中			结束当 前 循环			关键字后面不能声明执行语句
 *
 * continue :		循环结构中		 	结束当 次 循环			关键字后面不能声明执行语句
 *
 * */
public class BreakContinue06_00 {

    public static void main(String[] args) {

        for(int i = 1 ; i <= 10 ; i++) {

            if(i % 4 == 0) {

                //break; //123

                continue; //123 567 910
            }
            System.out.println(i);
        }

        System.out.println("\n");
        //***************************************************

        label: for(int i = 1 ; i <= 4 ; i++) {

            for(int j = 1 ; j <= 10 ; j++) {

                if(j % 4 == 0) {

                    //break; //默认结束包裹此关键字最近的一层循环
                    //continue; //默认跳过包裹此关键字最近的一层循环


                    //break label; //结束指定标识的一层循环结构
                    continue label; //结束指定标识的一层循环结构当次循环
                }

                System.out.println(j);
            }
        }


    }

}
