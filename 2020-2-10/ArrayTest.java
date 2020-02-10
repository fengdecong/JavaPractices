import java.util.Arrays;

/**
 *    测试java.util.Arrays工具类的使用
 */
public class TestArrays {
    public static void main(String[] args) {
        int[] a = {100,20,30,5,150};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,30));
        System.out.println("######################");
        /**
         * 数组存储表格数据
         */
        Object[] emp1 = {1001,"丰德聪",22,"学生"};
        Object[] emp2 = {1002,"丰德攀",20,"混混儿"};

        Object[][] tableData = new Object[2][];
        tableData[0] = emp1;
        tableData[1] = emp2;
        for(Object[] i:tableData ) {
            System.out.println(Arrays.toString(i));
        }
            System.out.println("######################");
    /**
    *   二分查找(折半检索)
    */
        int[] arr = {50,60,10,90,80,20,70,40,30,};
        Arrays.sort(arr);
        System.out.println(myBinarySearch(arr,30));

    }
    public static int myBinarySearch(int[] arr,int val){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(val == arr[mid]){
                return mid;
            }
            if(val >= arr[mid]){
                left = mid + 1;
            }
            if(val <= arr[mid]){
                right = mid - 1;
            }
        }
        return -1;
    }
}