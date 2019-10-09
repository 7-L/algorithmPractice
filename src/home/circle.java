package home;
/**
 * @Project: nowcoder_test
 * @Package home
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年10月06日 17:08
 * @version V1.0
 */

import Practice.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 *@author hzx
 *@createTime 06 17:08
 *@description
 */
public class circle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }


    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }



}
