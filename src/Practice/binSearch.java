package Practice;
/**
 * @Project: nowcoder_test
 * @Package Practice
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年10月06日 14:24
 * @version V1.0
 */

import java.util.Arrays;

/**
 * @author hzx
 * @createTime 06 14:24
 * @description
 */
public class binSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 75, 4, 12, 3, 45, 7, 65856, 85, 34, 231, 2, 5, 546, 77, 324};
        Arrays.sort(arr);
        System.out.println(binarySearch2(arr, 0, arr.length, 546));

    }

    private static int binarySearch(int[] arr, int l, int r, int key) {

        int left = l;
        int right = r-1;
        while (left < right) {
            int mid = (left + right) / 2;
            int midKey = arr[mid];
            if (midKey < key) {
                left = mid - 1;
            } else if (midKey > key) {
                right = mid + 1;
            }else
                return mid;
        }
        return -1;
    }

    private static int binarySearch2(int[] arr, int l, int r, int key) {
        int low = l;
        int high = r - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midKey = arr[mid];
            if (key > midKey) {
                low = mid + 1;
            } else if (key < midKey) {
                high = mid - 1;
            }else
                return mid;
        }
        return -1;
    }

}
