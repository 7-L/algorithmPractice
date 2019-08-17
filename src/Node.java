/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月17日 16:18
 * @version V1.0
 */

/**
 *@author hzx
 *@createTime 17 16:18
 *@description
 */
public class Node {
    private final int value;
    static Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.getValue());
            System.out.print(" ");
            head = head.getNext();
        }
        System.out.println();
    }
}
