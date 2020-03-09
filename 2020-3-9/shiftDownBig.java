//交换函数
public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
//大堆的向下调整
    public void shiftDownBig(int[] arr,int se,int parent){
        int child = parent * 2 + 1; // left child
        //从parent开始,一直调整到一子节点结束
        while(child < se ){
            //right child : child + 1
            if(child+1 < se && arr[child+1] > arr[child]){
                child++;
            }
            if(arr[child] > arr[parent]){
                //如果child大于parent,向下调整,交换值
                swap(arr,child,parent);
                //更新,继续向下调整
                parent = child;
                child = 2 * parent + 1;
            }
            else{
                //不需要调整
                break;
            }
        }
    }
	
	//建堆
	public static void creatHeapBig(int[] arr){
        for(int i=(arr.length-2)/2;i >= 0;i--){
            shiftDownBig(arr,arr.length,i);
        }
    }