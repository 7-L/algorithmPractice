/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月15日 10:52
 * @version V1.0
 */

/**
 *@author hzx
 *@createTime 15 10:52
 *@description
 */
public class testQuickSort {
    public static int[] sort(int[] array , int left ,int right){
        if(left < right){
            int partitionIndex = partition(array , left, right);
            sort(array,left,partitionIndex-1);
            sort(array,partitionIndex+1,right);
        }
        return array;
    }
    private static int partition(int[] array , int left, int right ){
        int pivot = left ;
        int index = pivot + 1;
        for(int i = index ; i<= right ; i++){
            if(array[i]<array[pivot]){
                swap(array,i ,index);
                index++;
            }
        }
        swap(array,pivot ,index -1);
        return index -1 ;
    }
    private static void swap(int[] array , int i , int j ){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
