import java.util.List;

/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月17日 16:17
 * @version V1.0
 */

/**
 *@author hzx
 *@createTime 17 16:17
 *@description
 */
public class LinkedListCreator {

    public Node createLinkedList(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        Node firstNode = new Node(data.get(0));
        firstNode.setNext(createLinkedList(data.subList(1, data.size())));
        return firstNode;
    }
}
