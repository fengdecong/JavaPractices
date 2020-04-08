import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split(" ");
        int[] nums = new int[arr.length - 1];
        for(int i = 0;i < arr.length - 1; i++){
            nums[i] = Integer.valueOf(arr[i]);
        }
		//最后一个输入的是为k
        int k = Integer.valueOf(arr[arr.length-1]);
        Arrays.sort(nums);
        for(int i = 0;i < k ;i++){
            System.out.print(nums[i] + " ");
        }
    }
}