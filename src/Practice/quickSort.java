package Practice;
/**
 * @Project: nowcoder_test
 * @Package Practice
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月21日 14:13
 * @version V1.0
 */

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author hzx
 * @createTime 21 14:13
 * @description
 */
public class quickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 23, 14, 44, 63, 10, 8, 4, 6, 1};
        for (int a : sort2(arr, 0, arr.length - 1)) {
            System.out.println("quickSort2---" + a);
        }
    }

    public static int[] sort(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            sort(array, left, partitionIndex - 1);
            sort(array, partitionIndex + 1, right);
//            HashMap;
        }
        Hashtable hashtable = new Hashtable();
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

    public static int[] sort2(int[] array ,int left, int right ){
        if(left<right){
            int partitionIndex = partition2(array, left,right);
            sort2(array,left,partitionIndex-1);
            sort2(array,partitionIndex+1,right);
        }
        return array;
    }

    public static int partition2(int[] array,int left, int right){
        int pivot = left ;
        int index = pivot +  1;
        for(int i = index ;i <=right;i++){
            if(array[i] < array[pivot]){
                swap2(array,i,index);
                index++;
            }
        }
        swap(array,pivot,index -1 );
        return index -1 ;
    }

    public static void swap2(int[] array ,int i , int j ){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



}
