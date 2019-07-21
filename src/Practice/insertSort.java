package Practice;
/**
 * @Project: nowcoder_test
 * @Package Practice
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月21日 16:30
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 21 16:30
 * @description
 */
public class insertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 23, 14, 44, 63, 10, 8, 4, 6, 1};
        for (int a : sort(arr)) {
            System.out.println("insertSort---" + a);
        }
    }

    private static int[] sort(int[] array) {
        int key;
        int pre;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            pre = i - 1;
            while (pre >= 0 && key < array[pre]) {
                array[pre + 1] = array[pre];
                pre--;
            }
            array[pre + 1] = key;
        }

        return array;
    }
}
