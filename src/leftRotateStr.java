/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年06月11日 10:26
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 11 10:26
 * @description
 */
public class leftRotateStr {
    public String leftRotateStr(String str, int n) {
        char[] chars = str.toCharArray();
        if (str == null || str.length() == 0)
            return "";
        if (n > chars.length)
            n = n % chars.length;
        reverser(chars, 0, n - 1);
        reverser(chars, n, chars.length - 1);
        reverser(chars, 0, chars.length - 1);
        return new String(chars);
    }

    public void reverser(char[] string, int start, int end) {
        while (start < end) {
            char temp = string[start];
            string[start] = string[end];
            string[end] = temp;
            start++;
            end--;
        }
    }



}

class run {
    public static void main(String[] args) {
        leftRotateStr leftRotateStr = new leftRotateStr();
            System.out.println(leftRotateStr.leftRotateStr("abcdefg",3));

    }
}
