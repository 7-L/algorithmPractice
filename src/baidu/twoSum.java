package baidu;

import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) throws Exception {
        int n, m, k;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();
        int a = 0;
        int b = 0;
        int mini = 0;
        int temp = 0;
        boolean flag = true;
        try {
            for (int i = 0; i <= 1000; i++) {
                if ((i-n) <= 0) {
                    break;
                } else {
                    b = (k + i * m - m * n) / (i - n);
                    a = i;
//                    b = i;
                    if (flag) {
                        mini = a + b;
                        flag = false;
                    }
                    if ((a + b) < mini) {

                        mini = a + b;
                    }
                }
                System.out.println(mini);
                temp = mini;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(temp-1);


    }
}
