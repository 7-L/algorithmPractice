package Practice;

import java.util.Scanner;
import java.util.TreeSet;

public class YY2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        char[] chars = string.toCharArray();
        System.out.println(fun(chars));
    }

    private static String fun(char[] string) {
        TreeSet<String> data1 = new TreeSet<String>();
        for (char s : string) {
            data1.add(String.valueOf(s));
        }
        String str = "";
        for (String s : data1) {
            str += s;
        }
        str.trim();
        return str;
    }
}
