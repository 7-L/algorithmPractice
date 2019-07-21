/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年06月11日 13:16
 * @version V1.0
 */

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
        for (int a : sort2(arr, 0, arr.length - 1)) {
            System.out.println("quickSort2---" + a);
        }
    }

    private static int[] sort2(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            sort2(array, left, partitionIndex - 1);
            sort2(array, partitionIndex + 1, right);
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

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
