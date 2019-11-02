public class RecursionPractices {
	
	
	//递归求阶乘
    public static int JieCheng(int n){
        int i=n;
        if(i==1){
            return 1;
        }
        return i* JieCheng(i-1) ;
    }
//  递归求斐波那契数列
        public static int fib ( int a){
            if (a == 1 || a == 2) {
                return 1;
            }
            return fib(a - 1) + fib(a - 2);
        }

    public static void main (String[]args){
            System.out.println(fib(5));
            System.out.println(JieCheng(5));
        }
    }