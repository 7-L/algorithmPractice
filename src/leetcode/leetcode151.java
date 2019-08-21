package leetcode;
/**
 * @Project: nowcoder_test
 * @Package leetcode
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月21日 9:28
 * @version V1.0
 */

import java.util.Stack;

/**
 * @author hzx
 * @createTime 21 9:28
 * @description
 */
public class leetcode151 {

    //    单词是反的，应该用栈，将每一个单词作为一个整体。
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[length - 1 - i];
            chars[length - 1 - i] = chars[i];
            chars[i] = temp;
        }
        String string = String.valueOf(chars);
        string.trim();
        return string;
    }

    public static String reverseWords2(String s) {
        String result;
        s = s.concat(" ");
        int length = s.length();
        StringBuffer sb = new StringBuffer();
        Stack stack = new Stack();
        for (int i = length - 1; i >= 0; i--) {
            while (s.charAt(i) == ' ') {
                while (stack.empty() != true) {
                    sb.append(stack.pop());
                }
                if (i == 0) break;
                i--;
            }

            if (s.charAt(i) != ' ') {
                if (i != length - 1 && s.charAt(i + 1) == ' ') {
                    stack.push(' ');
                }
                stack.push(s.charAt(i));
                if (i == 0) {
                    while (stack.empty() != true) {
                        sb.append(stack.pop());
                    }
                    break;
                }

            }
        }
        int sblength = sb.length();

        if (sblength != 0) {
            result = sb.substring(0, sblength - 1);
        } else {
            result = "";
        }
        return result;
    }


    public static void main(String[] args) {
        String abc = "a b  c ";
        System.out.println(reverseWords2(abc));
    }


}
