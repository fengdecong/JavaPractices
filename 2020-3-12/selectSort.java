//选择排序
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