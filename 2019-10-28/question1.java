import java.util.Scanner;

public class 兔子问题 {     //兔子问题类似于斐波那契数列程序分析,兔子的规律为1，1，2，3，5，8，13，21...
        public static void main(String[] args) {
            int num = 1,month;
            int tmp1 = 1,tmp2 = 1;
            int t=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入第几个月:");
            month=sc.nextInt();
            for(int i = 1;i <= month;i++) {
                if(i <= 2) {
                    num = 1;
                    t++;
                }
                else {
                    num = tmp1 + tmp2;
                    tmp2 = tmp1;
                    tmp1 = num;
                    t++;
                }
                //System.out.println("第"+i+"个月的兔子数是:"+num);   //可以查看每个月兔子的数量
            }
            System.out.println("第"+t+"个月的兔子数是:"+num);
        }
}