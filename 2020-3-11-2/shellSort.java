//希尔排序
public static void shellSort(int[] arr){
    //先对数据进行分组
    //每组数据进行插入排序 逻辑分组
    //同一数据,它们之间的数据间隔不一定是1
        int gap = arr.length;
        while(gap > 1){
            gap = gap / 3 + 1;
            for(int i = 0;i < arr.length - gap;i++) {
                int end = i;
                int key = arr[end + gap];
                while (end >= 0 && arr[end] > key) {
                    arr[end+gap] = arr[end];
                    end -= gap;
                }
                arr[end + gap] = key;
            }
        }
    }