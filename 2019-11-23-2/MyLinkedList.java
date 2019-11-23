public class MyLinkedList {

   /*
    //创建链表
    public static Node buildLinkedListHead(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        //1 2 3 4 5
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }*/

  //遍历链表,打印出链表
    public static void printLinkedList(Node head){
        Node cur = head;
        while(cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
    //链表头插
    public static Node pushFront(Node head,int val){
        Node node = new Node(val);
        node.next = head;
        return node;
    }

    //链表头删
    public static Node popFront(Node head){
        if(head == null) {
            throw new RuntimeException("空指针");
        }
        return head.next;
    }
    public static void main(String[] args) {

        Node head = null;
        //head = buildLinkedListHead();
        // 按序打印每一个值
        // 1 2 3 4 5
        // 如何遍历链表
        printLinkedList(head);

        head = pushFront(head,0);
        head = pushFront(head,1);
        head = pushFront(head,2);
        head = pushFront(head,3);
        head = pushFront(head,4);

        //printLinkedList(head);

        head = popFront(head);
      //  head = popFront(head);

        printLinkedList(head);
    }
}