package home;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/**
 * Created by Administrator on 2019/8/10.
 */
public class QuickSort {


    public static void main(String[] args) {
        int[] a = {11,5, 4, 3, 2, 1};
        for (int temp :
                sort2(a, 0, a.length-1)) {
            System.out.println(temp);
        }

    }

    public int x;
    public static void main2(String[] args) {
        System.out.println(fun());
        /*String s = "";
        System.out.println(s == null);
        int[] arr = new int[]{};
        System.out.println(arr == null);
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        Stream.of("jd", "jd.com", "www.jf.com", "wwwljd.id").mapToInt(String::length).filter(len -> len > 3).peek(System.out::println).limit(2);
        String s1 = new String("he");
        String t = new String("he");
        char[] c = {'h', 'e'};
        System.out.println(t.equals(c));
        System.out.println(s1 == t);
        System.out.println(s1.equals(c));*/
        /*String s1 = "";


        String s2 = null;
        String s3 = null;
        System.out.println(s1 == "");
        System.out.println(s2.equals(s3));*/
        /*   for (int i = 1; i <= 3; i++) {
            if (i == 2) {
                if (i == 2) {
                    if (i == 2) {
                        System.out.println("1i==2");
                        continue;
                    }
                    System.out.println("2");
                }
                System.out.println("3");
            }
            System.out.println("1"+i);
        }*/
    }

    private static int fun() {
        int i = 10;
        try {
            i = i / 0;
            return --i;
        } catch (Exception e) {
            --i;
            return i--;
        }finally {
            --i;
            return i--;
        }

    }

    private static int[] sort(int[] a, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(a, left, right);
            sort(a, left, partitionIndex - 1);
            sort(a, partitionIndex + 1, right);
        }
        return a;
    }

    private static int partition(int[] a, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (a[i] < a[pivot]) {
                swap(a, i, index);
                index++;
            }
        }
        swap(a, pivot, index - 1);
        return index-1;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static int[] sort2(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition2(array, left, right);
            sort2(array, left, partitionIndex - 1);
            sort2(array, partitionIndex + 1, right);
        }
        return array;
    }

    private static int partition2(int[] array, int left, int right) {
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

    private static void swap2(int[] array, int i, int j) {

    }

}
