/**
     * 快速排序 
	 *递归法
     */

    public static void quickSort(int[] arr,int left,int right){
        while(left < right) {
            int mid = partion1(arr,left,right);
            //进行分组
            quickSort(arr, left, mid - 1);
            quickSort(arr, mid + 1, right);
        }
    }

	//Hoare 法:
    public static int partion1(int[] arr, int left, int right){
        //基准值
        int key = arr[left];
        int start = left;
        while(left > right){
            //从后向前找第一个小于key的数据位置
            while (left < right && arr[right] >= key)
                right--;
            //从前向后找第一个大于key的数据位置
            while(left < right && arr[left] <= key)
                left++;
            //交换
            swap(arr,left,right);
        }
        //把基准值和相遇位置数据进行交换
        //错误: arr[left] = key; 相遇位置的数据被覆盖
        swap(arr,left,start);
        return left;
    }
	
	 //快速排序 填坑法
    public static int partion2(int[] arr,int left,int right){
        //获取基准值
        int key = arr[left];
        //挖坑填坑
        while(left < right){
            //从右边第一个小于key的数据,填左边的坑
            while(left < right && arr[right] >= key)
                --right;
            //填坑
            arr[left] = arr[right];
            //从左边找第一个大于key的数据,填右边的坑
            while(left < right && arr[left] <= key)
                ++left;
            //填坑
            arr[right] = arr[left];
        }
        //填基准值到中间相遇的位置
        arr[left] = key;
        return left;
    }
	
	 //前后遍历法
    public static int partion3(int[] arr,int left,int right){
        int key = arr[left];
        int cur = left+1; //下一个小于key的值
        int prev = left;  //最后一个小于key的值
        while(cur <= right){
            if(arr[cur] < key && prev++ != cur)
                swap(arr, prev, cur);
                cur++;
        }
        swap(arr,left,prev);
        return prev;
    }