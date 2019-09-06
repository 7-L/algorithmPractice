/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年09月05日 19:27
 * @version V1.0
 */

import java.util.Random;
import java.util.Scanner;

/**
 * @author hzx
 * @createTime 05 19:27
 * @description
 */
class zuoyebang {
    public static void main(String[] args) {
        int[] array = new int[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            array[i] = in.nextInt();
        }
        int[] result = new int[4];
        for (int i = 0; i < 4; i++) {
            if (Math.abs(array[i] + 5) < 10) {
                result[i] = array[i] + 5;
            } else {
                result[i] = (int) Math.ceil((array[i] + 5) / 10);
            }
        }

        int a = (int) Math.random();

        System.out.print(result[3] + result[2] + result[1] + result[0]);

   /*     Scanner in = new Scanner(System.in);

        String a = in.nextLine();

        String[] aa = a.trim().split(" ");

        int[] arr = new int[aa.length];
        for (int i = 0; i < aa.length; i++) {
            arr[i] = Integer.parseInt(aa[i]);
        }
        for (int i : arr) {
            System.out.println(i);*/
    }
}

