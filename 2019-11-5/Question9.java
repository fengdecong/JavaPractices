import java.util.Scanner;

//一球从a米高度自由落下，每次落地后反跳回原高度的一半；
// 再落下，求它在第b次落地时，共经过多少米,第b次反弹多高?
public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入是从多少米落下:");
        double a=sc.nextDouble();
        System.out.println("请输入经过几次反弹:");
        int b=sc.nextInt();
        int j=0;
        for(int i=0;i<b;i++){
            a=a/2;
            j+=a;
        }
        System.out.println("经过"+b+"此落地共经过:"+j+"米");
        System.out.println("第"+b+"次反弹是:"+a+"米");
    }
}