package algorithm;
/**
 * @Project: nowcoder_test
 * @Package algorithm
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月12日 15:45
 * @version V1.0
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *@author hzx
 *@createTime 12 15:45
 *@description  有两张方法，利用Arrays.sort来排序，第二个用顶堆排
 */
public class TopK {
//    通过使用priorityqueue来实现大小顶堆,PQ默认是小顶堆
    public static int[] findKMax(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for (int num : nums) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(num);
            } else if (priorityQueue.peek() < num) {
                priorityQueue.poll();
                priorityQueue.offer(num);
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k && priorityQueue.isEmpty(); i++) {
            result [i] = priorityQueue.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] array = new Integer[]{5, 4, 3, 1, 2};
//        重写comparator实现降序排序，升级版快排，无要求，可以使用
        Arrays.sort(array, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
            public boolean equals(Object obj) {
                return false;
            }
        });
        for (Integer integer : array) {
            System.out.println(integer);
        }
        System.out.println(Arrays.toString(findKMax(arr,5)));
    }
 }
