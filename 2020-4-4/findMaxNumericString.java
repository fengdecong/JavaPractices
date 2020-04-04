//字符串中找出连续最大的数字串
import java.util.Scanner;

public class Main{
    public static int  test(String str){
       char[] s = str.toCharArray();
        int max = 0;
        int cur = 0;
        int idx = 0;
        for(int i = 0;i < s.length; i++){
            if(s[i] >= '0' && s[i] <= '9')
                cur++;
            if(i == s.length-1||s[i+1] < '0' || s[i+1] > '9'){
                if(cur > max){
                    max = cur;
                    idx = i;
                }
                cur = 0;
            }
        }
        if(max == s.length-1)
           for(int i = 0;i < s.length; i++){
               System.out.println(s[i]);
           }
        for(int i = idx - max + 1; i <= idx;i++){
            System.out.print(s[i]);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        Main.test(str);
    }
}