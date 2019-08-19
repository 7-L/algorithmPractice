package netease_3;
import	java.util.Scanner;

public class EnglishSoftware {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();

        }
        int q = in.nextInt();
        int[] b = new int[q];
        for (int i = 0; i < q; i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < q; i++) {
            double p = 0;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[b[i] - 1] >= a[i]) {
                    count++;
                }
            }
            p = (double) (count - 1) / n * 100;
            System.out.printf("%.6f\n", p);
        }
    }
}
