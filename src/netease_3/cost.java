package netease_3;
/**
 * @Project: nowcoder_test
 * @Package netease_3
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月17日 15:14
 * @version V1.0
 */

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 *@author hzx
 *@createTime 17 15:14
 *@description 代价
 * 你有3个需要完成的任务，完成这3个任务是需要付出代价的。
 * 首先，你可以不花任何代价的完成一个任务；然后，在完成了第i个任务之后，你可以花费|Ai - Aj|的代价完成第j个任务。|x|代表x的绝对值。
 * 计算出完成所有任务的最小代价。
 *
 * 输入描述:
 *
 *  一行3个整数A1,A2,A3，每个数字之间用一个空格分隔。所有数字都是整数，并且在[1,100]范围内。
 *  输出描述:
 *
 *  一个整数，代表最小的代价。
 * 输入例子1:
 *
 * 1 6 3
 *
 * 输出例子1:
 *
 * 5
 *
 * 输入例子2:
 *
 * 10 10 10
 *
 *  输出例子2:
 *
 * 0
 */
public class cost {



    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>(5);
        int[] a = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(sub(a));
    }

    private static int sub(int[] array) {
        int result = 0 ;
        Arrays.sort(array);
        result = array[2] - array[0];
        return result;
    }
}
