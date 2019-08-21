package algorithm;
import	java.util.Comparator;

import javax.sound.midi.SoundbankResource;
import java.util.Arrays;
import java.util.PriorityQueue;

public class BottomK {
    //    最小的几个数，有两种做法，1是快排前几个，2个通过大顶堆

//    快排
    public static int[] bottomK(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
           result [i] = arr [i];
        }
        return result;
    }

    //    大顶堆
    public static int[] bottomKByPriorityQueue(int[] arr, int k) {
        int[] result = new int[k];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k,new Comparator<Integer> () {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i : arr) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(i);
            } else if (priorityQueue.peek() > i) {
                priorityQueue.poll();
                priorityQueue.offer(i);
            }

        }
        for (int i = 0; i < k; i++) {
            result [i] = priorityQueue.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 5, 4, 3, 2, 1};
        for (int i : bottomK(array, 5)) {
            System.out.println(i);
        }

        for (int temp : bottomKByPriorityQueue(array, 3)) {
            System.out.println(temp);
        }
    }
}
