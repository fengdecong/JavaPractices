class MinStack {
    Stack<Integer> a;
    Stack<Integer> b;
    /** initialize your data structure here. */
    public MinStack() {
        a = new Stack<>();
        b = new Stack<>();
    }
    
    public void push(int x) {
        if(b.isEmpty() || x <= b.peek()){
            b.push(x);
        }
        a.push(x);
    }
    
    public void pop() {
        int m = a.peek();
        if(m == b.peek()){
            b.pop();
        }
        a.pop();
    }
    
    public int top() {
        return a.peek();        
    }
    
    public int getMin() {
        return b.peek();
    }
}