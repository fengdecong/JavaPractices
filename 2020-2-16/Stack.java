import java.util.Arrays;

public class Stack {
    private int[] array;
    private int size;
    public Stack(int n){
        array = new int[n];
        size = 0;
    }
    public void push(int value){
        //检查容量
        if (size == array.length) {
        //增容 : 申请空间 拷贝
            array = Arrays.copyOf(array,2*size);
        }
        //尾插
        array[size++] = value;
    }

    public void pop(){
        if(size > 0){
            --size;
        }
    }

    public int peek(){
        return array[size - 1];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public static void main(String[] args) {
        Stack st = new Stack(2);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        //增容一次 容量变成4
        st.push(3);
        st.push(4);
        //第二次增容 容量变成8
        st.push(5);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println("top:"+st.peek());

        System.out.println("遍历");
        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }
        System.out.println();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}