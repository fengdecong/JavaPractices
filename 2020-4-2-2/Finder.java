//用快排实现找到第K大的数
public class Finder {
    public int findKth(int[] a, int n, int K) {
        // write code here
        quickSort(a,0,n-1);
        return a[n - K];
    }
    public static void quickSort(int[] a,int left,int right){
        if(left < right) {
            int mid = partion(a,left,right);
            quickSort(a,left, mid - 1);
            quickSort(a, mid + 1, right);
        }
    }
    public static int partion(int[] a, int left, int right) {
        int mid = getMid(a,left,right);
        swap(a,left,mid);
        int key = a[left];
        int cur = left+1; //下一个小于key的值
        int prev = left;  //最后一个小于key的值
        while(cur <= right){
            if(a[cur] < key && prev++ != cur)
                swap(a, prev, cur);
            cur++;
        }
        swap(a,left,prev);
        return prev;
    }
    public static int getMid(int[] a,int left,int right){
        //从arr[left] arr[mid] arr[right] 中选一个中间值
        int mid = (left + right) / 2;
        if(a[mid] > a[left]){
            if(a[mid] < a[right]) {
                return mid;
            } else{
                if(a[left] > a[right])
                    return left;
                else
                    return right;
            }
        }
        else{
            if(a[mid] > a[right])
                return mid;
            else {
                if (a[left] < a[right]) {
                    return left;
                } else
                    return right;
            }
        }
    }
    public static void swap(int[] a,int i,int j){
        int t;
        t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}