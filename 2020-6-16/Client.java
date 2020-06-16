import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try(DatagramSocket socket = new DatagramSocket()){
            while(true){
                System.out.print("随便输入什么然后回车>");
                String input = scanner.nextLine();
                byte[] sendBuffer = input.getBytes("UTF-8");
                DatagramPacket sendPacket = new DatagramPacket(
                        sendBuffer,0,sendBuffer.length,
                        InetAddress.getByName("233.172.121"),
                        9939
                );
                socket.send(sendPacket);
            }
        }
    }
}