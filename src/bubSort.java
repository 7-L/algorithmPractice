/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月12日 10:57
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 12 10:57
 * @description
 */
public class bubSort {

//    最差时间复杂度 o（n^2）
//    最优时间复杂度 o（n）
//    最差空间复杂度 o（n^2）
//    最优空间复杂度 o（n），需要辅助空间o（1）
    public static  int[] sort(int[] array) {
        boolean swap = false;
        for (int i = 0; i < array.length - 1; i++) {
            swap = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }

            }
            if (!swap) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11,23,14,44,63,10, 8, 4, 6, 1};
        for (int a : bubSort3(arr) ) {
            System.out.println("bubSort2---" + a);
        }
    }

    public int[] sortTwice(int[] array) {
        boolean swap = false;
        for (int i = 0; i < array.length - 1; i++) {
            swap = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return array;
    }

    public static int[] bubSort3(int[] array) {
        boolean swap = false;
        for (int i = 0; i < array.length - 1; i++) {
            swap = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return array;
    }
}
