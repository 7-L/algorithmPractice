package algorithm;
/**
 * @Project: nowcoder_test
 * @Package algorithm
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年09月17日 18:19
 * @version V1.0
 */

import java.util.Scanner;

/**
 *@author hzx
 *@createTime 17 18:19
 *@description
 */
public class fabnacii {
    public static int fab(int n) {
//        楼梯
        if (n == 1 || n == 2) {
            return n;
        }
        int result = 0;
        int i = 1;
        int j = 2;
        for (int k = 3; k <= n; k++) {
            result = i + j;
            i = j;
            j = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fab(n));

        System.out.println(fib(n));
    }

    public static int fib(int n) {
//        fibnacii数列求和
        if (n == 1 || n == 0) {
            return n;
        }
//        return fib(n - 1) + fib(n - 2);    //递归解法
        int result = 0;
        int i = 0;
        int j = 1;
        for (int k = 2; k <= n; k++) {
            result = i + j;
            i = j;
            j = result;

        }
        return result;
    }
}

