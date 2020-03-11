import java.util.Arrays;
//插入排序
public class MySort {
    //升序排序
    public static void insertSort(int[] arr){
        for(int i = 0;i < arr.length-1;i++){
            int key = arr[i+1];
            //i : 表示排好序的最后一个位置
            int end = i;
            while(end >=  0 && arr[end] > key){
                //把大的元素向后移
                arr[end+1] = arr[end];
                //继续向前搜索
                end--;
            }
            //end : -1  或者 <= key的一个位置
            arr[end+1] = key;
        }
    }

    public static void insertSort2(int[] arr){
        for(int i=1;i < arr.length;i++){
            //i : 下一个待排序的元素
            int key = arr[i];
            //end : 已排好序的最后一个数的位置
            int end = i-1;
            while(end >= 0 && arr[end]> key){
                arr[end + 1] = arr[end];
                end--;
            }
            arr[end + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,9,3,2,10,35,89,0,7,12};
        int[] copy = arr.clone();
        int[] copy2 = arr.clone();
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        insertSort2(copy);
        System.out.println(Arrays.toString(copy));
        Arrays.sort(copy2);
        System.out.println(Arrays.toString(copy2));
    }
}