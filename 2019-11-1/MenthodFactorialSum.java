import java.util.Scanner;

public class MenthodFactorialSum {
    public static void main(String[] args){
        System.out.println("请输入想求几的阶乘:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
      //求阶乘的方法
    public static int factorial(int n ){
        int factor=1;
        for(int i=1;i<=n;i++){
            factor*=i;
        }
        return factor;
    }
    //求和方法
    public static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=factorial(i);
        }
      return  sum;
    }