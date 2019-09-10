package Practice;

import com.sun.org.apache.bcel.internal.generic.LNEG;

public class YYtest1 {
    public ListNode removeN(ListNode head, int n) {
        ListNode first = null;
        int N = 0;
        if (n == 1) {
            first = null;
            return head;
        }
        if (n > N) {
            return null;
        } else {
            int index = 1;
            for (head = first; head != null; head = head.next) {
                if (index + 1 == n) {
                    head.next = head.next.next;
                    break;
                }
                index++;
            }
        }
        return head;
    }

}

class Main22{
    public ListNode remove(ListNode head, int index) {
        if (index < 1 || index > length(head)) {
            return head;
        }
        if (index == 1) {
            head = head.next;
            return head;
        }
        ListNode pre = head;
        ListNode cur = pre.next;
        int i = 1 ;
        while (cur != null) {
            if (i == index) {
                pre.next = cur.next;
                return pre;
            }
            pre = pre.next;
            cur = cur.next;
        }

        return pre;

    }


    public int length(ListNode head) {
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }
}

class Main{
    public ListNode remove(ListNode head, int index) {
        if (index < 1 || index < length(head)) {
            return head;
        }
        int count = 1;
        ListNode temp = head;
        while (temp.next != null) {
            if (index == count++) {
                temp.next = temp.next.next;

            }
            temp = temp.next;
        }
        return temp;
    }
    public int length(ListNode head) {
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }
}