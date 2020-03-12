 //选择排序 单向
 public static void selectSort2(int[] arr){
        //i : 未排序的最大位置
        for(int i = arr.length-1;i > 0;i--){
            int end = i;
            int index = i;
            //从所有未排序的数据中找到最大值的索引
            for(int j = end - 1;j >= 0;j--){
                if(arr[j] > arr[index])
                    index = j;
            }
            swap(arr,index,end);
        }
    }