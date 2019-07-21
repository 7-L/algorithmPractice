/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月14日 17:05
 * @version V1.0
 */

import javax.sound.midi.SoundbankResource;

/**
 * @author hzx
 * @createTime 14 17:05
 * @description
 */
public class insertSort {

    /*
     *
     * 普通插入排序   空间复杂度O(1) 时间复杂度O(n^2)
     * 思路:从第2个元素开始,与其左边的有序数组进行逐一比较,找到其需要正确插入的位置
     * 将该位置右边的数组向右移动一位,然后将当前元素插入进去
     *
     *
     * */
    public static int[] directSort(int[] array) {
        int key;
        int preIndex;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            preIndex = i - 1;
            while (preIndex >= 0 && key < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;

            }
            array[preIndex + 1] = key;
        }
        return array;
    }

    public static int[] dSort1(int[] array) {
        int key;
        int index;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            index = i - 1;
            while (index >= 0 && key < array[index]) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = key;
        }
//        Todo return
        return array;
    }

    public static int[] dSort(int[] array) {
        int key;
        int preIndex;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            preIndex = i - 1;
            while (preIndex >= 0 && key < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = key;
        }
        return array;

    }


    public static void main(String[] args) {
        int[] arr = {10, 8, 4, 6, 1};
        int[] arr2 = {19, 8, 4, 16, 1};
        for (int a : dSort1(arr)) {
            System.out.println("dSort1 = " + a);
        }

        for (int temp : halfSort(arr2)) {
            System.out.println("half" + temp);
        }
    }

    /*
     * 折半查询，未重写
     *
     * */
    public static int[] halfSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int pre = 0;
            int last = i - 1;
            while (pre <= last) {
                int mid = (pre + last) / 2;
                if (key < array[mid]) {
                    last = mid - 1;

                } else {
                    pre = mid + 1;
                }
            }
            for (int j = i; j >= pre + 1; j--) {
                array[j] = array[j - 1];
            }
            array[pre] = key;

        }
        return array;
    }



/*
    public static int[] binary(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int pre = 0;
            int last = i - 1;
            while (pre <= last) {
                int mid = (pre + last) / 2;
                if (key < mid) {
                    last = mid - 1;
                } else {
                    pre = mid + 1;
                }
            }
            for (int j = i; j >= pre + 1; j--) {
                array[j] = array[j - 1];
            }
            array[pre] = key;
        }
        return array;
    }
*/

}
