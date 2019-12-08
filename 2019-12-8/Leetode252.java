class MyStack {
    LinkedList<Integer> queue ;
    /** Initialize your data structure here. */
    public MyStack() {
        this.queue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for(int i=0;i<queue.size()-1;i++){
            queue.offer(queue.poll());
        }
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        int i = queue.size();
        while(i>1){
            queue.offer(queue.poll());
            i--;
        }
        int ret = queue.poll();
        queue.offer(ret);
        return ret;
       
    }