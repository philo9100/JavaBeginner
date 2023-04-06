package com.atguigu.study04;
/*
 * ��֧�ṹ֮����switch-case
 *
 * 1.��ʽ
 * switch ( ���ʽ ){
 * case ����1 :
 * 		ִ�����1;
 * 		//break;
 *
 * case ����2 :
 * 		ִ�����2;
 * 		//break;
 *
 * . . . . . .
 *
 * default:
 * 		ִ�����n;
 * 		//break;
 *
 * }
 *
 * 2.˵��:
 * �ٸ���switch���ʽ�е�ֵ������ƥ�����case�еĳ���
 * һ��ƥ��ɹ����������Ӧ��case�ṹ�У�������ִ����䡣
 * ��������ִ������Ժ���if-else�ṹ��ͬ����if-else������ִ���������䣬����������֧�ṹ
 * ��switch��Ȼ��������ִ������case�ṹ�е�ִ����䣬ֱ������break�ؼ��ֻ��switch-case�ṹ
 * ĩβ����Ϊֹ��
 *
 * ��break,����ʹ����switch-case�ṹ�У���ʾһ��ִ�е��˹ؼ��֣�������switch-case�ṹ
 *
 * ��switch�ṹ�еı��ʽ��ֻ�������µ�6����������֮һ��
 * 		byte��short��char��int��ö�����ͣ�JDK5.0��������String���ͣ�JDK7.0������
 *
 * �� case ֮��ֻ����������������������Χ
 *
 * �� break�ؼ����ǿ�ѡ�ģ�����ʵ��д���ǲ�д
 *
 * �� default : �൱��if-else�ṹ�е�else
 * 				default�ṹ�ǿ�ѡ��
 * 				default �Ľṹ�����ƶ���Ĭ�϶���д������Ҳ���break���
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
                System.out.println("��ů����");
                break;
            case "" :
                System.out.println("��������");
                break;
            case "summer" :
                System.out.println("�����ˬ");
                break;
            case "autumn" :
                System.out.println("��ѩ����");
                break;
            default :
                System.out.println("������������");
                //break;
        }

        //****************���µ�������������벻ͨ��*******************

        //���һ
//		boolean isHandsome = true;
//		switch(isHandsome) {
//		case true :
//		System.out.println("�Һ�˧");
//		break;
//		case false :
//		System.out.println("�Һó�");
//		break;
//		default :
//		System.out.println("��������"); }
//		//break;

        //�����
//		int age = 10;
//		switch(age) {
//		case age > 18:
//			System.out.println("������");
//			break;
//		default :
//			System.out.println("δ����");
//		//break;
//		}

    }

}
