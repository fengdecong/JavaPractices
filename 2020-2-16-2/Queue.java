class Node{
    int value;
    Node next;
        }
public class Queue {
    Node front;
    Node rear;
    int size;
    public Queue(){
        //空队列
        front = rear = null;
        size = 0;
    }
    public void offer(int value){
        Node newNode = new Node();
        newNode.next = null;
        newNode.value = value;
        //空队列
        if(front == null){
            front = rear = newNode;
        }else {
            //尾插
            rear.next = newNode;
            rear = rear.next;
        }
        ++size;
    }
    public void poll(){
        if(front == null)
            return;
        front = front.next;
        //处理最后一个节点
        if(front == null)
            rear = null;
            --size;
        }
    public int peek(){
        if(front == null )
            return -1;
        return front.value;
    }
    public int rear(){
        if(front == null){
            return -1;
            }
            return front.value;
        }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;

     }

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }
        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }
}