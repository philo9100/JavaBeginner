package com.atguigu.project;

public class FamilyAccount {

    public static void main(String[] args) {

        boolean isFlag = true;

        //用于记录用户的收入和支出的详情
        String details = "收 支\t  账户金额\t 收支金额\t 说 明\n";

        //初始金额
        int balance = 10000;

        while(isFlag) {

            System.out.println("----------------家庭收支记账软件----------------");
            System.out.println("                 1.收支明细");
            System.out.println("                 2.登记收入");
            System.out.println("                 3.登记支出");
            System.out.println("                 4.退    出\n");
            System.out.println("                 请选择(1-4):");
            //获取用户的选择: 1-4
            char selection = Utility.readMenuSelection();

            switch(selection) {

                case '1':
                    //System.out.println("1.收支明细");break;
                    System.out.println("----------------当前收支明细记录----------------");

                    System.out.println(details);

                    System.out.println("-----------------------------------------------\n");

                    break;

                case '2':
                    //System.out.println("2.登记收入");break;

                    System.out.println("本次收入金额: ");
                    int addMoney = Utility.readNumber();

                    System.out.println("本次收入说明: ");
                    String addInfo = Utility.readString();

                    //处理balance
                    balance += addMoney;

                    //处理details
                    details += ("收 入\t   " + balance + "\t \t  " + addMoney + "\t \t " + addInfo + "\n");

                    System.out.println("-------------------登记完成---------------------\n");

                    break;

                case '3':
                    //System.out.println("3.登记支出");break;

                    System.out.println("本次支出金额: ");
                    int minusMoney = Utility.readNumber();

//						System.out.println("本次支出说明: ");
//						String minusInfo = Utility.readString();

                    //处理balance
                    if(balance >= minusMoney) {
                        balance -= minusMoney;

                        System.out.println("本次支出说明: ");
                        String minusInfo = Utility.readString();

                        //处理details
                        details += ("支 出\t   " + balance + "\t \t  " + minusMoney + "\t \t " + minusInfo + "\n");
                    }
                    else {
                        System.out.println("支出金额超出账户额度,支付失败");
                    }

                    System.out.println("-------------------登记完成---------------------\n");

                    break;

                case '4':
                    //System.out.println("4.退    出");break;
                    System.out.println("确认是否退出(Y/N): ");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit == 'Y') {
                        isFlag = false;
                    }
                    //break;
            }

            //isFalg = false;
        }


    }

}


