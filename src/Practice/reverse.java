package Practice;

/**
 * @Project: nowcoder_test
 * @Package Practice
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月22日 13:38
 * @version V1.0
 */

/**
 *@author hzx
 *@createTime 22 13:38
 *@description
 */
public class reverse  {
    public ListNode rList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }
}
