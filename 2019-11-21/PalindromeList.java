   //求链表是否是回文链表
public class PalindromeList {
	//求出链表的中间位置
    public ListNode getMiddle(ListNode head){	
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
            if(fast == null){
                return slow;
            }
            fast = fast.next;
        }
        return slow;
    }
       //链表逆置
    public ListNode reverseList(ListNode head){
        ListNode nHead = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;

            cur.next = nHead;
            nHead = cur;
            cur = next;
        }

        return nHead;
    }
      //判断回文
    public boolean chkPalindrome(ListNode A){
        ListNode middle = getMiddle(A);
        ListNode rHead = reverseList(middle);
        ListNode c1 = A;
        ListNode c2 = rHead;

        while(c1 != null && c2 != null){
            if(c1.val != c2.val){
                return false;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        return true;
    }