import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int w = sc.nextInt();
            int count = 0;
            int[][] arr = new int[h][w];
            for(int i = 0;i < h; i++){
                for(int j = 0;j < w; j++){
                    if(arr[i][j] == 0){
                        count++;
                        if(i + 2 < h){    //将行里不满足条件的坐标置为1
                            arr[i+2][j] = 1;
                        }
                        if(j + 2 < w){    //将列里不满足条件的坐标置为1
                            arr[i][j+2] = 1;
                        }
                    }
                }
            }
        System.out.println(count);
    }
}