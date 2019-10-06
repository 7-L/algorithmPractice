package home;
public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{9, 75, 4, 12, 3, 45, 7, 65856, 85, 34, 231, 2, 5, 546, 77, 324};
        for (int i : bubSort2(arr)) {
            System.out.println(i);
        }

      /*  for (int i : quickSort(arr,0,arr.length-1)) {
            System.out.println(i);
        }*/

    }

/*    public static int[] bubSort(int[] array) {
        boolean swap = false;
        for (int i = 0; i < array.length - 1; i++) {
            swap = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    swap = true; // 如果某一轮冒泡发现没有任何位置的交换,那么说明这个数组已经是有序的,无需再进行下一轮冒泡
                }
            }
            if (!swap)
                break;
        }
        return array;
    }*/

    public static int[] bubSort(int[] arr) {
        boolean swap = false;
        for (int i = 0; i < arr.length - 1; i++) {
            swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j ] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
//            如果没有变换顺序，立刻跳出当前循环
            if (!swap) {
                break;

            }
        }
        return arr;
    }

    public static int[] bubSort2(int[] arr) {
        boolean swap = false;
        for (int i = 0; i < arr.length-1; i++) {
            swap = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            while (!swap) {
                break;

            }
        }
        return arr;
    }

    public static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }

        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
