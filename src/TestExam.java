/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年06月11日 13:26
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 11 13:26
 * @description
 */
public class TestExam {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        i = i++ + ++i + i++ + i++;
        j = ++j + ++j + j++ + j++;
        System.out.println(i + "   " + j);

        int[] arr = new int[]{11, 23, 14, 44, 63, 10, 8, 4, 6, 1};
        for (int a : sort(arr, 0, arr.length - 1)) {
            System.out.println("testSort ---" + a);
        }
    }

    public static int[] sort(int[] array, int left, int right) {
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
                swap(array, index, i);
                index++;
            }
        }
        swap(array, pivot, index - 1);
        return index - 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
