public static int binarySearch(int[] a,int v){
        int left=0;
        int right=a.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(v<a[mid]){
               right=mid-1;
            }
            else if(v>a[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("所找的数字下标为:"+binarySearch(a,3));
    }
}