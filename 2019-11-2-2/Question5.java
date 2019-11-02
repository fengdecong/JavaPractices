import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("请输入两个正整数:");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a<b) {
            int t;
            t=a;
            a=b;
            b=t;
        }
        else if(a==b){
            System.out.println("最大公约数为:"+b);
        }
            while(a%b!=0) {
                int n;
                n= a % b;
                a = b;
                b = n;
                if(a%b==0){
                    System.out.println("最大公约数为:"+b);
                }
            }
    }
}