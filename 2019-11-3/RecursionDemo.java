 import java.util.Scanner;
 
 public class RecursionDemo;
 //递归求一个数的每一位的和
 public static int recursionSum(int n){
        if(n<10){
            return n%10;
        }
        return n%10+recursionSum(n/10);
    }
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 
        System.out.println(recursionSum(9527));