package com.atguigu.study04;

/*
 * 编写程序从1循环到150，并在每行打印一个值
 * 另外在每个3的倍数行上打印出“foo”
 * 在每个5的倍数行上打印出“biz”
 * 在每个7的倍数行上打印出“baz”
 *
 * */
public class For04_01 {
    public static void main(String[] args) {

//		//有点垃圾~ ~ ~
//		for(int i = 1 ; i <= 150 ; i++) {
//		    if(i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
//		    	System.out.println("第" + i + "行" + "foo biz baz");
//		    }
//		    else if(i % 3 == 0 && i % 5 == 0) {
//		    	System.out.println("第" + i + "行" + "foo biz");
//		    }
//		    else if(i % 3 == 0 && i % 7 == 0) {
//		    	System.out.println("第" + i + "行" + "foo baz");
//		    }
//		    else if(i % 5 == 0 && i % 7 == 0) {
//		    	System.out.println("第" + i + "行" + "biz baz");
//		    }
//		    else if( i % 3 == 0) {
//				System.out.println("第" + i + "行" + "foo");
//			}
//			else if(i % 5 == 0) {
//				System.out.println("第" + i + "行" + "biz");
//			}
//			else if(i % 7 == 0) {
//				System.out.println("第" + i + "行" + "baz");
//			}
//			else {
//				System.out.println("第" + i + "行" );
//			}
//		}

        for(int i = 1 ; i <= 150 ;i++ ) {
            System.out.print(i + " ");

            if(i % 3 == 0)
                System.out.print("foo ");

            if(i % 5 == 0)
                System.out.print("biz ");

            if(i % 7 == 0)
                System.out.print("baz ");

            System.out.println();  //换行
        }

    }

}