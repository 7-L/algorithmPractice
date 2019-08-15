package leetcode;
import	java.util.Scanner;
/**
 * @Project: nowcoder_test
 * @Package leetcode
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月15日 19:45
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 15 19:45
 * @description leetcode 20 String中大中小括号是否合法
 *
 */
public class StringLegal {
    public static void main(String[] args) {
        String a = "";
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        if (isLegel(a)) {
            System.out.println("true");
        }
    }

    private static boolean isLegel(String a) {
        int length;
        do {
            length = a.length();
            a = a.replace("()", "").replace("{}", "").replace("[]", "");
        } while (length != a.length());
        return a.length() == 0;
    }

}
