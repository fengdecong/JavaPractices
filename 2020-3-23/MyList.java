class  MyList<E>{
    //静态成员不能定义泛型 : 属性和函数
    //private static E e;
    private static class Node<E>{ 
        private E value;
        Node<E> next;
        private Node(E value){
            this.value = value;
            next = null; 
        }
    }
    private Node<E> head = null;
    public void pushFront(E value){
        if(head == null){
            head = new Node<>(value); 
        }
        else{
            Node<E> node = new Node(value);
            node.next = head;
            head = node; 
        } 
    }
    public E popFront(){
        E ret = head.value;
        head = head.next;
        return ret; 
    }
}