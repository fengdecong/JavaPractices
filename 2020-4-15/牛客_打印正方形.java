import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String a = sc.next();
        int n = m % 50;  //列数
        int x = 0;
		//判断行数
        if(m % 2 == 1){
            x = m / 2 + 1;
        }
        else{
            x = m / 2;
        }
        for(int i = 0;i < x; i++){
            for(int j = 0;j < n; j++){
                if(i == 0 || i == x-1){
                    System.out.print(a);
                }else{
                    if(j == 0 || j == n - 1 ){
                        System.out.print(a);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}