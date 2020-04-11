/**
*将一个数变为斐波那契数的最小次数
*/

import java.util.Scanner;
import static java.lang.Math.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getNum(n));;
    }
    private static int getNum(int n) {
        int num=0,x = 0;
        while (true){
            if (Fibonacci(num)>=n){
                x=Fibonacci(num);
                break;
            }else {
                num++;
            }
        }
        int y=Fibonacci(num-1);
        return min(abs(y-n),abs(x-n));
    }
    private static int Fibonacci(int n){
        if (n==0){
            return 0;
        }else {
            if (n==1){
                return 1;
            }else {
                return Fibonacci(n-1)+Fibonacci(n-2);
            }
        }
    }
}