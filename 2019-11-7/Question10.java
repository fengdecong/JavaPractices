 //乘法口诀表
 import .java.util.Scanner;
 
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要几的乘法表:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++) {
            for (int j=1;j<=i;j++) {
                int t;
                t=j*i;
                System.out.print(j+"*"+i+"="+t+" " );
            }
            System.out.println();
        }
    }
}