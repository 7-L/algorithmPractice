package WanMeiShiJie;
/**
 * @Project: nowcoder_test
 * @Package WanMeiShiJie
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年09月16日 10:40
 * @version V1.0
 */

import java.util.Scanner;

/**
 * @author hzx
 * @createTime 16 10:40
 * @description 求字符串的最长重复子串
 */
public class SubString {
    public static String maxRepat(String str) {

        int len = str.length();
        int tmp = 0;
        int startp = 0;
        int max = 0;

        if (str == null || str.length() == 0) {
            return "";
        }

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int p1 = i;
                int p2 = j;//兩個指針，向後遍歷
                while (p2 < len) {
                    if (str.charAt(p1) == str.charAt(p2)) {
                        tmp++;
                        p1++;
                        p2++;
                    } else {
                        break;
                    }
                    if (p1 >= j) {
                        break;
                    }
                }

                if (tmp > max) {
                    max = tmp;
                    startp = i;
                }
                tmp = 0;

            }
        }

        //System.out.println(max);
        return str.substring(startp, startp + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(maxRepat(str));

    }

}
