public class Question6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个正整数");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a<b) {     //交换啊a,b,保证a>b
            int t;
            t=a;
            a=b;
            b=t;
        }
        else if (a==b){
            System.out.println("最小公倍数是:"+a);
        }
        int i=2;
        int n=a;   //n用来保存原来a的数值
        while(a%b!=0){
            a=n*i;
            i++;
            if(a%b==0){
                System.out.println("最小公倍数是:"+a);
            }
        }
    }
}