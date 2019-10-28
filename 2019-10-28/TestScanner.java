import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的名字");
            String name = scanner.nextLine();
            System.out.println("请输入你的爱好");
            String favor = scanner.nextLine();
            System.out.println("请输入你的年龄");
            int age = scanner.nextInt();
            System.out.println("############");

            System.out.println("姓名:"+name);
            System.out.println("爱好:"+favor);
            System.out.println("年龄:"+age);
        }
    }