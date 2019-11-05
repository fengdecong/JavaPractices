import java.util.Scanner;

public class 完数 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);   
        System.out.println("请输入多少范围内的数;");
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++){   
            int m=0;
            for(int j=1;j<i;j++) {    //j不能等于i,因为本身不能算
                if (i % j == 0) {   
                    m += j;         //计算所有因数的累计和
                }
            }
            if(m==i){                //判断是否是完数
                System.out.println(m);
                sum++;
            }
        }
        System.out.println("共有完数:"+sum);
    }
}