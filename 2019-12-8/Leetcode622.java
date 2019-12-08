class MyCircularQueue {
    private int front;
    private int rear;
    private Integer[] queue;
    private int size;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queue =new Integer[k];
        size = k;
        front = 0;
        rear = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        queue[rear] = value;
        rear = (rear+1) % size;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        queue[front] = null;
        front = (front + 1) % size;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return queue[front];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }if(rear == 0){
            return queue[size - 1];
        }else{
            return queue[rear - 1];
        }
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front == rear && queue[front] == null;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
            return front == rear && queue[front] != null;
    }
}