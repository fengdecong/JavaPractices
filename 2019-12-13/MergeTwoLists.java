//合并两个链表
public class MergeTwoLists {

    public static Node mergeTwoLists(Node list1,Node list2) {
        //判断两个链表其中一个是否为空
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        Node cur1 = list1;
        Node cur2 = list2;
        Node nHead = null;
        Node nLast = null;
        //循环比较两个链表的值,将小的尾插到新链表后面
        while(cur1 != null &&cur2 != null){
            if(cur1.val <= cur2.val){
                //判断头链表是否为空
                if(nHead == null){
                    nHead = cur1;
                }else{
                    nLast.next = cur1;
                }
                nLast = cur1;
                cur1 = cur1.next ;
            }else{
                if(nHead == null){
                    nHead = cur2;
                }else{
                    nLast.next = cur2;
                }
                nLast = cur2;
                cur2 = cur2.next;
            }
            if(cur1 != null) {
                nLast.next = cur1;
            } else{
                nLast.next = cur2;
            }
        }
        return nHead;
    }

    public static void main(String[] args) {
        Node n5 = new Node(5);
        Node n4 = new Node(4,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);

        Node m4 = new Node(13);
        Node m3 = new Node(7,m4);
        Node m2 = new Node(1,m3);
        Node m1 = new Node(0,m2);

        Node result = mergeTwoLists(n1,m1);
        printList(result);
    }
    //打印链表的方法
    private static void printList(Node head) {
        for(Node cur = head; cur !=null; cur = cur.next){
            System.out.println(cur);
        }
    }
}