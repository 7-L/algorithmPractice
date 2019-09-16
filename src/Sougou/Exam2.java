package Sougou;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        int first;
        int second;
        for (int i = 1; i <= m; i++) {
            first = in.nextInt();
            second = in.nextInt();
            if (first <= second) {
                for (int j = first; j <= second; j++) {
                    arr[j] = i;
                }
            } else {
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i * arr[i];
        }
        System.out.println(sum%100000009);
    }
}
