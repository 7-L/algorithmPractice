package Practice;
/**
 * @Project: nowcoder_test
 * @Package Practice
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月21日 14:13
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 21 14:13
 * @description
 */
public class quickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 23, 14, 44, 63, 10, 8, 4, 6, 1};
        for (int a : sort2(arr, 0, arr.length - 1)) {
            System.out.println("quickSort2---" + a);
        }
        int[] sorted = sort2(arr, 0, arr.length - 1);
        for (int i = 0; i < sorted.length/2; i++) {
            int temp = sorted[i];
            sorted[i] = sorted[sorted.length - 1 - i];
            sorted[sorted.length - 1 - i] = temp;
        }

        for (int b : sorted) {
            System.out.println("翻转数组---" + b);
        }
    }

    private static int[] sort(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            sort(array, left, partitionIndex - 1);
            sort(array, partitionIndex + 1, right);
        }
        return array;
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (array[i] < array[pivot]) {
                swap(array, i, index);
                index++;
            }
        }
        swap(array, pivot, index - 1);
        return index - 1;

    }

    private static void swap(int[] array, int pivot, int i) {
        int temp = array[pivot];
        array[pivot] = array[i];
        array[i] = temp;
    }

    public static int[] sort2(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition2(array, left, right);

            sort2(array, partitionIndex + 1, right);
            sort2(array, left, partitionIndex - 1);
        }
        return array;
    }

    private static int partition2(int[] array, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (array[i] < array[pivot]) {
                swap2(array, i, index);
                index++;
            }
        }
        swap2(array, pivot, index - 1);
        return index - 1;
    }

    private static void swap2(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



}
