import java.util.*;

public class GuessGame {
    public static void main(String[] args){
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.println("欢迎来到猜数字游戏");
        System.out.println("请稍后,数字生成中...");
        int n = random.nextInt(100);
        System.out.println("数字已经生成");
        int times=4;
        System.out.println("你有"+times+"次机会");
        for(int i=1;i<=times;i++){
             System.out.print("开始: ");
            int x=scanner.nextInt();
            if(x==n){
                System.out.println("恭喜你猜对了! 你用了"+i+"次机会");
                return ;
            }
            else if(x>n){
                System.out.println("第"+i+"次,猜大了");
            }
            else{
                System.out.println("第"+i+"次,猜小了");
            }
        }
        System.out.println("正确结果是"+n);
    }
}