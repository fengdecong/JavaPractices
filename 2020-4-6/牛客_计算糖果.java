import java.util.Scanner;

public class Main{

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextDouble();
        }
        int  A = 0, B = 0, C = 0;
        A = (int)(arr[0] + arr[2]) / 2;
        B = (int)(arr[1] + arr[3]) / 2;
        C = (int)(arr[3] - arr[1]) / 2;
        if(A - (arr[0] + arr[2]) / 2 != 0){
            System.out.println("No");
            return;
        }
        if(B - (arr[1] + arr[3]) / 2 != 0 || B != (arr[2] - arr[0]) / 2){
            System.out.println("No");
            return;
        }
        if(C - (arr[3] - arr[1]) / 2 != 0 ){
            System.out.println("No");
            return;
        }
        System.out.println(A + " " + B + " " + C);
    }
}