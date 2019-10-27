public class TestIfQianTao {
    public static void main(String[]agre) {
        //求1-100之间的奇数和与偶数和
        int sum01=0;
        int sum02=0;
        for(int m=1;m<=100;m++) {
            if(m%2==0) {
                sum01+=m;
            }
            else {
                sum02+=m;
            }
        }
        System.out.println("奇数是="+sum01);
        System.out.println("偶数是="+sum02);

        System.out.println("##################");
        //求1-100内能被5整除的数
        int t=0;
        for(int i=1;i<=100;i++) {
            if(i%5==0) {
                System.out.print(i+"\t");
                t++;
            }
            if(t==5) {
                System.out.println();
                t=0;
            }
        }

        System.out.println("##################");
        //求9*9乘法表
        for(int j=1;j<=9;j++) {
            for(int i=1;i<=j;i++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}