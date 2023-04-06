package com.atguigu.study05;

public class forTest01_01 {

    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1 ; i <= 100 ; i++) {
            if(i % 2 != 0 ) {
                sum += i;
            }
        }
        System.out.println(sum);

        int sum1 = 0;
        int count = 0;
        for(int i = 1 ; i <= 100 ; i++) {

            if(i % 7 == 0) {
                count++;
                sum1 += count;
            }
        }
        System.out.println(count);
        System.out.println(sum1);

        int i ;
//		int b = i / 100;
//		int s = i /10 % 10;
//		int g = i % 10;

        for(i = 100 ; i <= 900 ; i++) {
            if(i == (i/100)*(i/100)*(i/100)+(i/10%10)*(i/10%10)*(i/10%10)+(i%10)*(i%10)*(i%10) )
                System.out.print(i + " ");
        }

    }

}
