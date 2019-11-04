import java.util.Scanner;
//求s=a+aa+aaa+aaaa+aaaaa a的数值和几位相加都由键盘输入
public class Question1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入a的大小要求1-9");
        long a=sc.nextLong();
        System.out.println("请输入要求相加几项");
        long b=sc.nextLong();
        long s=0;
        long i=0;
        for(;i<=b;i++){               //这两个循环就直接把结果求了
            int w=1;
            for(long j=b-i;j>0;j--){   //个位是a*b*1  十位是a*(b-1)*10  百位是a*(b-2)100 以此类推然后累加
                w=w*10;
            }
            s=s+a*w*i;
        }
        System.out.print("s=");   
        for(int m=1;m<=b;m++){        //循环打印a和+  
            for(int n=1;n<=m;n++){
                System.out.print(a);
            }
            if(m!=b)    
                System.out.print("+");
        }
        System.out.print("="+s);
    }
}