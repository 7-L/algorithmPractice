package leetcode;
import	java.util.PriorityQueue;

public class leetcode703KthLargest {
    /*
    * 返回数据流中的第K大元素
    * */

    final PriorityQueue<Integer> priorityQueue;
    final int k;

    public leetcode703KthLargest(int k, int[] a) {
        this.k = k;
        priorityQueue = new PriorityQueue<> (k);
        for (int i : a) {
            add(i);
        }
    }

    public int add(int i) {
        if (priorityQueue.size() < i) {
            priorityQueue.offer(i);
        } else if (priorityQueue.peek() < i) {
            priorityQueue.poll();
            priorityQueue.offer(i);
        }
        return priorityQueue.peek();
    }
}
