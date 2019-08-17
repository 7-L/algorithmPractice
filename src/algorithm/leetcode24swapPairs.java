package algorithm;

import Practice.ListNode;

public class leetcode24swapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        ListNode res = pre;
        while (head != null && head.next != null) {
            ListNode next = head.next.next;
            pre.next = head.next;
            pre = head;
            head.next.next = head;
            head = next;
        }
        pre.next = head;
        return res.next;
    }


}
