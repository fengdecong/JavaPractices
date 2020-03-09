/**
     * 小堆向下调整
     */
    public static void shiftDownSmall(int[] arr,int se,int parent){
        int child = parent * 2 + 1;
        while(child < se){
            if(child + 1 < se && arr[child+1] < arr[child]){
                ++child;
            }
            if(arr[child] < arr[parent]){
                swap(arr,child,parent);
                parent = child;
                child = parent * 2 + 1;
            }else{
                break;
            }
        }
    }
	
	//建堆
	public static void creatHeapSmall(int[] arr){
        for(int i=(arr.length-2)/2;i >= 0;i--){
            shiftDownSmall(arr,arr.length,i);
        }
    }
	
	//交换函数
	public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }