import java.util.Scanner;
public class Main{
	//先算出整数的位数
  public static int length(int n){
        int count = 0;
        int m = n;
        while(m > 0){
            m /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[length(n)];
        int i = 0;
        int m = n;
        while(m > 0){
            a[i] = m % 10;
            m /= 10;
            i++;
        }
        for(int j = 0;j < length(n);j++){
            System.out.print(a[j]);
        }
    }
}