/**
 * Created by Administrator on 2019/10/3.
 */
package home;

import static Practice.quickSort.sort2;

public class mergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 75, 4, 12, 3, 45, 7, 65856, 85, 34, 231, 2, 5, 546, 77, 324};
        mergeSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        sort2(arr, 0, arr.length - 1);
    }

    public static void sort2(int[] arr, int l, int r) {
        if (l == r) {
            return ;
        }
        int mid = (l + r) / 2;
        sort2(arr, l, mid);
        sort2(arr, mid + 1, r);
        merge3(arr, l, mid, r);
    }

    private static void merge3(int[] arr, int l, int mid, int r) {
        int p1 = l;
        int p2 = r;

    }


    public static void sort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
//        int mid2 = L + ((R - L) >> 1);
        int mid = (L + R) / 2;
        sort(arr, L, mid);
        sort(arr, mid + 1, R);
        merge2(arr, L, mid, R);
    }

    public static void merge2(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while (p2 <= R) {
            temp[i++] = arr[p2++];
        }
        for (int j = 0; j < temp.length; j++) {
            arr[L + j] = temp[j];
        }

    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        // 比较左右两部分的元素，哪个小，把那个元素填入temp中
        while (p1 <= mid && p2 <= R) {
            temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 上面的循环退出后，把剩余的元素依次填入到temp中
        // 以下两个while只有一个会执行
        while (p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while (p2 <= R) {
            temp[i++] = arr[p2++];
        }
        // 把最终的排序的结果复制给原数组
        for (i = 0; i < temp.length; i++) {
            arr[L + i] = temp[i];
        }
    }
}
