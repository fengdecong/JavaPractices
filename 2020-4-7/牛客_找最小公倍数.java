import java.util.Scanner;
public class Main{
    public static int test(int A,int B){
		//保证 A >= B
        if(A < B ){
            int tmp = A;
            A = B;
            B = tmp;
        }
        int k;
		//找A B 的最大公约数
        while(B != 0){
           k = A % B;
           A = B;
           B = k;
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A * B / test(A,B));
    }
}