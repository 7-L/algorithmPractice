package leetcode;
import	java.util.Scanner;
import java.util.Stack;
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
        System.out.println(useStack(a));
    }

    private static boolean isLegel(String a) {
        int length;
        do {
            length = a.length();
            a = a.replace("()", "").replace("{}", "").replace("[]", "");
        } while (length != a.length());
        return a.length() == 0;
    }

    private static boolean useStack(String s) {
        if ((s.length() & 1) == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char temp : s.toCharArray()) {
            if (temp == '(') {
                stack.push(')');
            } else if (temp == '{') {
                stack.push('}');
            } else if (temp == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != temp) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean useStackTry(String string) {
        int length = string.length();
        if ((length & 1) == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<> ();
        for (char temp : string.toCharArray()) {
            if (temp == '(') {
                stack.push(')');
            } else if (temp == '[') {
                stack.push(']');
            } else if (temp == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != temp) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
