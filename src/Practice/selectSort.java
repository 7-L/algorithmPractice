package Practice;
/**
 * @Project: nowcoder_test
 * @Package Practice
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月21日 16:03
 * @version V1.0
 */

/**
 *@author hzx
 *@createTime 21 16:03
 *@description
 */
public class selectSort {

    public static int[] sort(int[] array) {
        int index;
        int min;
        for (int i = 0; i < array.length; i++) {
            index = i;
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            int t = array[i];
            array[i] = array[index];
            array[index] = t;
        }
        return array;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{11, 23, 14, 44, 63, 10, 8, 4, 6, 1};
        for (int a : sort(arr)) {
            System.out.println("selectSort---" + a);
        }
    }
}
