/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月09日 18:52
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 09 18:52
 * @description
 */
public class selectSort {
    public static int[] selectSort(int[] array) {
        int index;
        int min;
        for (int i = 1; i < array.length; i++) {
            index = i;
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;

                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }

    public static int[] sort(int[] array) {
        int index;
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            index = i;
            min = array[i];
            for (int j = i; j < array.length ; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11, 23, 14, 44, 63, 10, 8, 4, 6, 1};
        int[] arr2 = {5, 4, 3, 2, 1};
        for (int a : sort(arr2)) {
            System.out.println("selectSort2---" + a);
        }
    }
}
