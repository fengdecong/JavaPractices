public ListNode copy(ListNode head) {
        ListNode result = null;
        ListNode resultList = null;
        for (ListNode c = head; c != null; c = c.next) {
            ListNode node = new ListNode(value);
            if (result == null) {
                result = node;
            } else {
                resultList.next = node;
            }
        }
        return result;
    }