package leetcode;

/*
* 最长回文子串
* */
public class leetcode5 {
    public static String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String test = s.substring(i, j);
                if (isPalindromic(test) && test.length() > max) {
                    ans = s.substring(i, j);
                    max = Math.max(max, ans.length());
                }
            }
        }
        return ans;
    }

    private static boolean isPalindromic(String test) {
        int length = test.length();
        for (int i = 0; i < length / 2; i++) {
            if (test.charAt(i) != test.charAt(length - i - 1)) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "asdfghjklkjhgasdfasf";
        System.out.println(longestPalindrome(a));
    }
}
