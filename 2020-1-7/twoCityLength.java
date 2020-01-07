import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] num = new double[10][10];  //用来保存距离的数组
        System.out.println("请按顺序输入个城市名");
        String[] city = new String[10];
        for (int i = 0;i < 10;i++){
            city[i] = sc.next();
        }
        System.out.println("按顺序输入经度");
        double[] longitude = new double[10];
        for(int i = 0;i < 10;i ++){
            longitude[i] = sc.nextDouble();
        }
        System.out.println("按顺序输入纬度");
        double[] latitude = new double[10];
        for(int i = 0;i < 10;i ++){
            latitude[i] = sc.nextDouble();
        }
        for(int i = 0;i < 10;i ++){
            for(int j = i + 1;j < 10;j ++){
                //求两地的距离
                num[i][j] = Math.sqrt(Math.pow((longitude[i] - longitude[j]),2)*111 +
                        Math.pow((latitude[i] - latitude[j]),2)*90);
            }
        }
    }
}