package Practice;
/**
 * @Project: nowcoder_test
 * @Package Practice
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月21日 15:10
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 21 15:10
 * @description
 */
public class bubSort {

    /*
    * 总结：
    * 总得来说冒泡排序，是对于一个数组，进行两层循环，第一层循环作为第一层index的进度
    * 第二层作为把按照第一层循环的进度的数组长度进行截取，然后在第二层数组的循环中进行比较
    * 将遍历到当前的数组元素和下一个数组元素对比，如果小于其下一个，则进行交换，并把swap标志设置为真
    * 当第一层开始遍历的时候，默认把swap标志设置为假，如果第二层进行调换后，检查swap标志的真假，如果为真，则跳出当前循环
    *
    * */

    public static void main(String[] args) {
        int[] arr = new int[]{11, 23, 14, 44, 63, 10, 8, 4, 6, 1};
        for (int a : bubSortFun(arr)) {
            System.out.println("bubSort2---" + a);
        }
    }

    public static int[] bubSortFun(int[] array) {
        boolean swap = false;
        for (int i = 0; i < array.length - i - 1; i++) {
            swap = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }

            }
            while (swap) {
                break;
            }
        }
        return array;
    }
}
