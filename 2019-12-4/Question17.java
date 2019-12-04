import java.util.Scanner;
//求字符串长度
public class Question6 {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String mys= s.next();
        System.out.println(str_len(mys));
    }
    public static int str_len(String x)
    {
        return x.length();
    }
}