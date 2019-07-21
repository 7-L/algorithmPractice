/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月14日 18:28
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 14 18:28
 * @description
 */
public class quickSort {
    //  快速排序 效率o（N*logN）
    public static int[] sort(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            sort(array, left, partitionIndex - 1);
            sort(array, partitionIndex + 1, right);
        }
        return array;
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{11, 23, 14, 44, 63, 10, 8, 4, 6, 1};
        for (int a : sort2(arr, 0, arr.length - 1)) {
            System.out.println("quickSort2---" + a);
        }
        for (int a : sort(arr, 0, arr.length - 1)) {
            System.out.println("quickSort---" + a);
        }

        testQuickSort testQuickSort = new testQuickSort();
        for (int a : testQuickSort.sort(arr, 0, arr.length - 1)) {
            System.out.println("testQuickSort---" + a);
        }
    }


    public static int[] sort2(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex2 = partition2(array, left, right);
            sort2(array, left, partitionIndex2 - 1);
            sort2(array, partitionIndex2 + 1, right);
        }
        return array;
    }

    private static int partition2(int[] arr2, int left, int right) {
        int pivotNew = left;
        int index = pivotNew + 1;
        for (int i = index; i <= right; i++) {
            if (arr2[i] < arr2[pivotNew]) {
                swap2(arr2, i, index);
                index++;
            }
        }
        swap2(arr2, pivotNew, index - 1);
        return index - 1;
    }

    private static void swap2(int[] arr2, int i, int j) {
        int temp = arr2[i];
        arr2[i] = arr2[j];
        arr2[j] = temp;
    }
}
