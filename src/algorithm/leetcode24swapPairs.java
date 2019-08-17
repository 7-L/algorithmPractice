package algorithm;

import Practice.ListNode;


/*
        给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

        你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
*/
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
