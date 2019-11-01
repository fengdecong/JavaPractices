import java.util.Random;
import java.util.Scanner;

public class SuperGuessGame {
    public static int selectDifficult() {
        System.out.println("1. 简单");
        System.out.println("2. 中等");
        System.out.println("3. 地狱");
        Scanner scanner = new Scanner(System.in);
        int difficult = scanner.nextInt();
        scanner.nextLine();

        return difficult;
    }

    public static int generateRandom(int difficult) {
        Random random = new Random();
        switch (difficult) {
            case 1:
                System.out.println("请输入1-50的数字");
                return random.nextInt(50);
            case 2:
                System.out.println("请输入1-100的数字");
                return random.nextInt(100);
            case 3:
                System.out.println("请输入1-150的数字");
                return random.nextInt(150);
        }

        return -1;
    }

    public static int generateTimes(int difficult) {
        Random random = new Random();
        switch (difficult) {
            case 1:
                return 10;
            case 2:
                return 5;
            case 3:
                return 3;
        }

        return -1;
    }

    public static boolean guess(int r) {
        System.out.println("请输入数字:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n == r) {
            return true;
        } else if (n < r) {
            System.out.println("猜小了");
        } else {
            System.out.println("猜大了");
        }

        return false;
    }

    public static void main(String[] args) {
        // 1. 难度选择
        int difficult = selectDifficult();
        // 2. 生成随机数2
        int r = generateRandom(difficult);
        int times = generateTimes(difficult);
        // 3. 循环 x 次机会
        boolean success = false;
        for (int i = 0; i < times; i++) {
            // 4. 读取用户的输入并且给出合适的提示
            success = guess(r);
            System.out.println("DEBUG: 上次猜的结果是: " + success);
            if (success) {
                break;
            }
        }

        // 5. 根据用户的猜测的结果，给出游戏最终结果
        if (success) {
            System.out.println("你比CXK聪明");
        } else {
            System.out.println("你是CXK的菜");
        }
    }
}