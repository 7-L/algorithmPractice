/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月16日 17:25
 * @version V1.0
 */

import java.util.PriorityQueue;

/**
 *@author hzx
 *@createTime 16 17:25
 *@description
 */
public class KLargest {
    static PriorityQueue<Integer> priorityQueue ;
      int k;
    //    实时判断数据流中第K大数据
    public  void sort(int[] array, int k) {
        this.k = k;
        priorityQueue = new PriorityQueue<>(k);
        for (int i : array) {
            add(i);
        }

    }

    private  int add(int i) {
        if (priorityQueue.size() < this.k) {
            priorityQueue.offer(i);
        } else if (Integer.valueOf(priorityQueue.peek().toString() ) < i) {
            priorityQueue.poll();
            priorityQueue.offer(i);
        }
        return Integer.valueOf(priorityQueue.peek().toString());
    }

    public static void main(String[] args) {
        int[] a = {2,1, 3, 4, 5, 6, 7, 8, 89};
        KLargest kLargest = new KLargest();
        kLargest.sort(a,3);
    }

    int capacity;

    PriorityQueue<Integer> priorityQueueTemp;

    public void sort1(int[] array, int k) {
        this.capacity = k;
        priorityQueueTemp = new PriorityQueue<>(k);
        for (int i : array) {
            addTwo(i);
        }
    }

    private int addTwo(int n) {
        if (priorityQueueTemp.size() < this.capacity) {
            priorityQueueTemp.offer(n);
        } else if (priorityQueueTemp.peek() < n) {
            priorityQueueTemp.poll();
            priorityQueueTemp.offer(n);
        }
        return priorityQueueTemp.peek();
    }
}
