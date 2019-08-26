package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class jd1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n] ;
        for (int i = 0; i < n; i++) {
            arr [i] = in.nextLong();
        }
        System.out.println(count(arr));
    }
    public static int count(long[] array) {
        Map<Long, Long> map = new HashMap<Long, Long>();
        for (long  a : array) {
            map.put(a, map.get(a) == null ? 1 : map.get(a) + 1);
        }
        int count = 0;
        for (long key : map.keySet()) {
            int jc = 1;
//            System.out.println(key + ": "+map.get(key));
            if (map.get(key) > 1) {
                long temp = map.get(key);
                for (int i = 1; i <= temp ; i++) {
                    jc *=i;
                }
                count += jc;
            }
        }
       return count;
    }
}
