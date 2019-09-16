package algorithm;
import	java.util.Scanner;

public class decoder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        System.out.println(fun(temp));
    }

    private static int fun(int temp) {
        int sum = 0 ;
        int index = 1;
        while (index != 0) {
            if ((temp & index) != 0) {
                sum++;
            }
            index = index << 1;
        }
        return sum;
    }
}
