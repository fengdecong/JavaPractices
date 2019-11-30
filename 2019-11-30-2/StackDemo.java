import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while(!stack.isEmpty()) {
            System.out.println(stack.peek()); //读取数据
            System.out.println(stack.pop());  //出栈
        }
    }
}