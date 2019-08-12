package Practice;
/**
 * @Project: nowcoder_test
 * @Package Practice
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月12日 10:02
 * @version V1.0
 */

import com.sun.org.apache.xpath.internal.functions.FuncSubstringBefore;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hzx
 * @createTime 12 10:02
 * @description
 */
public class FangCha {
    public static void main(String[] args) {
        int capicity;
        Scanner scanner = new Scanner(System.in);
        capicity = scanner.nextInt();
        int[] n = new int[capicity];
        for (int i = 0; i < capicity; i++) {
            n[i] = scanner.nextInt();
        }
        System.out.printf("%.2f",fc(n));
    }

    private static double fc(int[] n) {
        Arrays.sort(n);
        Integer[] integers;
        for (int temp : n) {
            System.out.println(temp);
        }
        return 12.34567;
    }
}
