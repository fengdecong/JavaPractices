//非递归快速排序

public static void quickSortNoR(int[] arr,int left,int right){
	int left = 0;
	int right = arr.length - 1;
	Stack<Integer> st = new Stack<>();

	if(left > right){
		st.push(left);
		st.push(right);
	}
	while(!st.isEmpty){
		int right1 = st.pop();
		int left1 = st.pop();
		//分组
		int mid = partions3(arr,left1,right1);
		//新的分组继续压栈
		if(mid - 1 > left1){
			st.push(left);
			st.push(mid - 1);
		}
		if(mid + 1 < right1){
			st.push(mid - 1);
			st.push(right1);
		}
	}
}	

//三数取中法 : 为了让数据分组更加均衡
    public static int getMid(int[] arr,int left,int right){
        //从arr[left] arr[mid] arr[right] 中选一个中间值
        int mid = (left + right) / 2;
        if(arr[mid] > arr[left]){
            if(arr[mid] < arr[right])
                return mid;
            else{
                if(arr[left] > arr[right])
                    return left;
                else
                    return right;
            }
        }
        else{
            if(arr[mid] > arr[right])
                return mid;
            else {
                if (arr[left] < arr[right]) {
                    return left;
                } else
                    return right;
            }
        }
    }
	
	//前后遍历法
    public static int partion3(int[] arr,int left,int right){
        int mid = getMid(arr,left,right);
        swap(arr,left,mid);
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