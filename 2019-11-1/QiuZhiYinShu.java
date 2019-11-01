import java.util.Scanner;

public class 分解质因数 {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            int a, b;
            int j = 0;
            System.out.println("请输入一个整数:");
            a = sc.nextInt();
            b = a;     //保存原数
            int num[] = new int[10];
            for (int i = 2; a != 1; ) {    //求质因数
                if (a % i == 0) {
                    num[j] = i;
                    j++;
                    a = a / i;
                } else
                    i++;
            }
                System.out.print(b + "=");
                for (int i = 0; i < j; i++) {
                    System.out.print(num[i]);
                    if (i < j - 1)    //判断是否是最后一位质因数,不是输出*
                        System.out.print("*");
                }
                    System.out.println();
        }
    }
}