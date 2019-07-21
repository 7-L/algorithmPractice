package netease_3;
/**
 * @Project: nowcoder_test
 * @Package netease_3
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月18日 9:38
 * @version V1.0
 */

import java.util.Scanner;

/**
 * @author hzx
 * @createTime 18 9:38
 * @description 在一条街上有n幢房子，标号从1到n，两个在标号上相差为1的房子视为相邻，这些房子中有k幢房子已有住户。
 * 现你准备搬入这条街，你能搬入一幢房子的条件是这幢房子没有人住在里面，与此同时由于你非常热爱与邻居进行交流，故而你需要你所入住的房子两边上都有住户。
 * <p>
 * 现要你求最小的可能符合要求的房子数，以及最大的可能符合要求的房子数。
 * <p>
 * Note: 就样例来说，#代表已有住户，-代表空位，这种情况（###---)，没有满足条件的房子，为最小，故输出0
 * 最大的情况为(#-#-#-)，此种情况有二个位置满足条件，为最大，故输出2
 */
public class house {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        t = scanner.nextInt();
        int[][] array = new int[t][2];
        for (int i = 0; i < t; i++) {
            int n, k;
            n = scanner.nextInt();
            k = scanner.nextInt();
            if (k >= n - 1 || n < 3 || k < 2) {
                array[i][0] = 0;
                array[i][1] = 0;
            } else if (n - k >= 2) {
                array[i][0] = 0;
                array[i][1] = n - k;
            }

        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j][0] + " "+ array[j][1]);
        }
    }

}
