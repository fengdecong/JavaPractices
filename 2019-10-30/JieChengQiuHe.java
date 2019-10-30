//阶乘求和 1!+2!+3!+4!+5!
public class JieChengQiuHe {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=5;i++) {
            int temp=1;
            for (int j=1;j<=i;j++) {
                temp=temp*j;
            }
            sum=sum+temp;
        }
        System.out.println(sum);
    }
}