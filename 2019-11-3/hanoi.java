import java.util.Scanner;

public class RecursionDemo {
    //汉诺塔问题  递归解决 目的是将盘子从0号盘子移到2号盘子
    public static void  hanoi(int n,int from,int to){  //from表示起始盘子,to表示目标盘子
        if(n==1){
            System.out.println("从"+from+"移动到"+to);
        }else {
            int other=1;
            hanoi(n-1,from,to);
            System.out.println("从"+from+"移动到"+other);
            hanoi(n-1,other,to);
        }
    }
	
	public static void main(String[] args){
       // System.out.println(recursionSum(9527));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入有几个盘子:");
        int a;
        a=sc.nextInt();
        hanoi(a,0,2);
    }

}