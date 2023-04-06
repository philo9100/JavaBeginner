package com.atguigu.study05;

/*
 * 质数输出的优化
 *
 * 10000以内的所有质数的输出
 * 从2开始，到这个数-1为止，都不能被这个数本身整除
 *
 * 最小的质数是：2
 * */
public class for_for05_03 {

    public static void main(String[] args) {

        boolean isFalg = true; //标识i是否被j除尽，一旦除尽，修改其值，代表其不是质数

        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();

        for (int i = 2; i < 10000; i++) { //遍历10000以内的自然数

            //优化二: 首先一个原数要有因数的话，那么因数一定是成对儿存在的，除了1和它本身的因数外
            //如果还有其他因数则必然是一个因数增大伴随另一个因数减小，临界的情况是两个因数相等
            //即是，原数开方得到的数。如果小于2到原数开方得到的数中都找不到原数存在的因数
            //那就说明原数是一个质数！！！
            for (int j = 2; j < Math.sqrt(i); j++) { //找i的因数
                if (i%j==0){
                    isFalg = false;
                    break;//优化一: 一旦发现i 对第一个 j 取模后 == 0 就说明i不是一个质数
                          //之后i 就不用再对j 之后的数取模了直接跳出循环
                }
            }
            if (isFalg == true) System.out.println(i + " ");

            //重置isFalg
            isFalg = true;
        }

        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();

        System.out.println("所花费的时间为: " + (end - start));

    }

}
