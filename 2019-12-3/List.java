import java.util.Arrays;

public class List {
  //元素交换
   public  static void swap(int[] a, int j, int i) {
       int t = a[i];
       a[i] = a[j];
       a[j] = t;
    }
    //冒泡排序
   public static void bubbleStor(int[] a){
        for(int i =0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                   swap(a,j,j+1);
                }
            }
        }
    }

   //二分查找
   public static int binarySearch(int[] a,int value){
       int left = 0;
       int right = a.length;
       while(left < right){
           int mid = (left + right)/2;
            if(value ==a[mid]){
                return mid;
            } else if(value > mid){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return -1;
     }
        //进行数组的复制,返回一个新的数组
   public static int[] copyOf(int[] a,int newLength){
       int[] dest = new int[newLength];
       int length = Math.min(newLength,a.length);
        for(int i = 0;i < length;i++){
            dest[i] = a[i];
        }
        return dest;
     }
    //复制一段数组
   public static int[] copyOfRange(int[] a,int from, int to){
        int[] dest = new int[to-from];
        for(int i = from;i <to;i++){
            dest[i-from] = a[i];
        }
        return dest;

     }
   public static void fill(int[] a,int val){
       for(int i = 0;i < a.length;i++){
           a[i] = val;
       }

   }
   public static  void fill(int[] a,int from ,int to,int val){
        for(int i = from;i < to;i++){
            a[i-from] = val;
        }
   }
   //判断两个数组是否相等
   public static boolean equals(int[] a,int[] b){
       if(a.length != b.length){
           return false;
       }
        for(int i = 0;i < a.length;i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
   }

   public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {5,4,3,2,1};
        int[] c = {5,5,3,3,1};
        int[] d = {5,4,3,2,1};
        int[] src = {1,2,3,4};
        int[] dest = {1,2,3,4};

        bubbleStor(a);
        bubbleStor(b);
        bubbleStor(c);
       // binarySearch(a,2);
        copyOf(a,4);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(binarySearch(a,4));
        System.out.println(binarySearch(a,9));
        System.out.println(Arrays.toString(copyOf(a,3)));
        System.out.println(Arrays.toString(copyOf(a,5)));
        System.out.println(Arrays.toString(copyOf(a,7)));
        System.out.println(Arrays.toString(copyOfRange(a,1,3)));
        System.out.println(equals(a,d));
        fill(a,5);
   }
}