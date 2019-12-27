package Banker;

import java.util.Scanner;

public class TestBankerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean Choose = true;
        String C;
        System.out.println("请输入进程个数：");
        int pNum = sc.nextInt();
        System.out.println("请输入资源种类数：");
        int sNum = sc.nextInt();
        BankerClass bc = new BankerClass(pNum,sNum);
        bc.start(pNum,sNum);
        while (Choose == true) {
            bc.setRequest(pNum,sNum);
            System.out.println("您是否还要进行资源请求：Yes/No?");
            C = sc.next();
            if (C.equals("Yes")) {
                Choose = true;
            }
            if(C.equals("No")){
                Choose = false;
            }
        }
    }
}
