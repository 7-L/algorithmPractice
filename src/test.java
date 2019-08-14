/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年06月11日 13:16
 * @version V1.0
 */

import java.util.ArrayList;

/**
 * @author hzx
 * @createTime 11 13:16
 * @description
 */
class test {
    public static void main(String[] args) {
        int arr[] = new int[args.length];
        float var1 = 0;
        for (int i = 0; i < args.length; i++) {
            arr[i] = (new Integer(args[i]).intValue());

        }
        for (int i = 0; i < arr.length; i++) {
            var1 = (i % 2 == 0) ? 0 : arr[i];

        }
//        String[] test = {"20","45","60","85","100","205","300","405"};
//        main(test);
        System.out.println(var1 / args.length);
    }


}

class test2 {
    public static void main(String[] args) {
        String[] test = {"20", "45", "60", "85", "100", "205", "300", "405"};
        test test1 = new test();
        test1.main(test);
    }

}


class quickSortTest {

    public static void main(String[] args) {
        int[] arr = new int[]{11, 23, 14, 44, 63, 10, 8, 4, 6, 1};
       /* for (int a : sort(arr, 0, arr.length - 1)) {
            System.out.println("quickSort2---" + a);
        }*/
        int[] a = sort(arr,0,arr.length-1);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int j = 0; j < 4; j++){
            arrayList.add(a[j]);
        }
        System.out.println(arrayList);

    }

    private static int[] sort(int[] array, int left, int right) {
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
                swap(array, i, index);
                index++;
            }
        }
        swap(array, pivot, index - 1);
        return index - 1;
    }

    private static void swap(int[] array, int pivot, int i) {
        int temp = array[pivot];
        array[pivot] = array[i];
        array[i] = temp;
    }

}
