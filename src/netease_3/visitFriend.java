package netease_3;
/**
 * @Project: nowcoder_test
 * @Package netease_3
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月18日 9:34
 * @version V1.0
 */

import java.util.Scanner;

/**
 *@author hzx
 *@createTime 18 9:34
 *@description
 */
public class visitFriend {

    public static void main(String[] args) {
        double step;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        step = Math.ceil(x / 5.0);
        System.out.println(step);
    }
}
