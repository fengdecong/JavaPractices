//计算平均值
public class Array {

    public static double avg(int[] a){
        int m=0;
        for(int i=0;i<a.length;i++){
            m=m+a[i];
        }
        double t=0;
        t=1.0*m/(a.length);
        return t;
    }
//找出最大值
    public static int max(int[] a){

        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
//找出某一个数第一次出现的值
    public static int indexOf(int[] a,int t){
        for(int i=0;i<a.length;i++){
            if(i==t){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        int[] a={7,4,1,2,5,8,6,3,5,};
        System.out.println(max(a));
        System.out.println((avg(a)));
        System.out.println((indexOf(a,5)));
    }
}