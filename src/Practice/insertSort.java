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
        /*
        * 首先明确一个最简单的道理，就是对于直接插入排序,首先对于整个数组进行第一步一层循环，
        * 定义两个局部变量，分别为key 和 pre，首先key 是第一层循环的循环值，pre则为当前第一层循环值减一
        * 然后进行对比，比较交换，对比循环当前数组中的值和设置为循环体中循环值的前一个值
        * 最终调换成功后，将pre+1的位置设置为key，因为pre为循环值-1
        * */

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
