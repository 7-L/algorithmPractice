package algorithm;
/**
 * @Project: nowcoder_test
 * @Package algorithm
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月06日 14:39
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 06 14:39
 * @description 给定两个字符串，判断是否一个字符串包含另外一个字符串，如果包含，返回起始位置。比如： String  str1=“abceacmk32acmzq”
 * <p>
 * String str2=“acm”
 * <p>
 * 可以看出，str1包含两处str2，下面红色地方：
 * <p>
 * abceacmk32acmzq
 * <p>
 * 返回4和10.
 */
public class KMP_Practise {
    public static void main(String[] args) {
        String string1 = "abceacmk32acmzqhkhjkhjk";
        char[] chars1 = string1.toCharArray();
        String string2 = "acm";
        char[] chars2 = string2.toCharArray();
        String string3 = "abceac";
        char[] chars3 = string3.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[0]) {
                continue;
            }
            String temp = string1.substring(i, i + string2.length());
            if (temp.equalsIgnoreCase(string2)) {
                System.out.println(i);
            }
        }

        solution2(chars1, chars3);

    }

    private static void solution2(char[] chars1, char[] chars2) {
        int i = 0;
        int j = 0;
        while (i < chars1.length && j < chars2.length) {
            if (chars1[i] == chars2[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
            if (j == chars2.length - 1) {
                j = 0;
                System.out.println(i - chars2.length + 1);
            }
        }
    }
}
