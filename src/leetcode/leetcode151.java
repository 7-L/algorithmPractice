package leetcode;
import	java.awt.TextField;
/**
 * @Project: nowcoder_test
 * @Package leetcode
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月21日 9:28
 * @version V1.0
 */

import java.util.Arrays;
import java.util.Collections;
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

    public static String reverse(String s) {
        Stack<String> stack = new Stack<>();
        String temp = new String();
        String[] result = s.split(" ");
        for (String s1 : result) {
            stack.push(s1);
        }
        while (!stack.empty()) {
            temp += stack.pop().toString().concat(" ");
        }
        temp.trim();
        System.out.println(temp);
        return temp;
    }

    public static  String reverseWords3(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public String reverseWords4(String s) {
        if (s == null) return null;
        char[] s_arr = s.toCharArray();
        int n = s_arr.length;
        // 翻转这个数组
        reverse(s_arr, 0, n - 1);
        System.out.println(new String(s_arr));
        // 翻转每个单词
        word_reverse(s_arr, n);
        System.out.println(new String(s_arr));
        // 去除多余空格
        return clean_space(s_arr, n);
    }

    private void reverse(char[] s_arr, int i, int j) {
        while (i < j) {
            char t = s_arr[i];
            s_arr[i++] = s_arr[j];
            s_arr[j--] = t;
        }
    }

    private void word_reverse(char[] s_arr, int n) {
        int i = 0;
        int j = 0;
        while (j < n) {
            // 找到第一个首字母
            while (i < n && s_arr[i] == ' ') i++;
            j = i;
            // 末位置
            while (j < n && s_arr[j] != ' ') j++;
            reverse(s_arr, i, j - 1);
            i = j;
        }
    }

    private String clean_space(char[] s_arr, int n) {
        int i = 0;
        int j = 0;
        while (j < n) {
            while (j < n && s_arr[j] == ' ') j++;
            while (j < n && s_arr[j] != ' ') s_arr[i++] = s_arr[j++];
            while (j < n && s_arr[j] == ' ') j++;
            if (j < n) s_arr[i++] = ' ';
        }
        return new String(s_arr).substring(0, i);
    }

    public static void main(String[] args) {
        String[] abc = "aaa bb  c".split(" |");
        String a = "aaa bb c";
//        abc.split(" ");
//        System.out.println((abc));
//        System.out.println(reverseWords2(abc));
        System.out.println(reverse(a));
    }


}
