package com.atguigu.study05;

/*
 * 100以内的所有质数的输出
 * 从2开始，到这个数-1为止，都不能被这个数本身整除
 *
 * 最小的质数是：2
 * */

public class for_for05_02 {

    public static void main(String[] args) {

//		boolean isFalg = true; //标识i是否被j除尽，一旦除尽，修改其值
//
//		//1.
//		for(int i = 2; i <= 100 ; i++) { //遍历100以内的自然数
//
//			for(int j = 2 ; j < i ; j++ ) { //找i的因数
//
//				if(i % j == 0) {
//					isFalg = false ;
//				}
//			}
//
//			if(isFalg == true) {
//				System.out.print(i + " ");
//			}
//			//重置isFalg
//			isFalg = true ;
//		}
//
        System.out.println();

        //2.
        for(int i = 2 ; i <= 100 ; i++) {

            boolean isFalg = true;//相当于给每个数都带了一个标志，不需要再重置标志了，但是意味着
                                  //所占用的内存就多了
            for(int j = 2 ; j < i ; j++) {

                if(i % j == 0) {
                    isFalg = false;
                }
            }
            if(isFalg == true) {
                System.out.print(i + " ");
            }
        }


    }

}
