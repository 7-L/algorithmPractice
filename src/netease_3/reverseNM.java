package netease_3; /**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月17日 13:43
 * @version V1.0
 */

import java.util.Scanner;

/**
 *@author hzx
 *@createTime 17 13:43
 *@description
 */

/*
*  网易笔试翻转翻转
* 给定一个N*M的矩阵，在矩阵中每一块有一张牌，我们假定刚开始的时候所有牌的牌面向上。
现在对于每个块进行如下操作：
翻转某个块中的牌，并且与之相邻的其余八张牌也会被翻转。
XXX
XXX
XXX
 如上矩阵所示，翻转中间那块时，这九块中的牌都会被翻转一次。
 请输出在对矩阵中每一块进行如上操作以后，牌面向下的块的个数。
输入描述:
 输入的第一行为测试用例数t(1 <= t <= 100000),
 接下来t行，每行包含两个整数N,M(1 <= N, M <= 1,000,000,000)
输出描述:
 对于每个用例输出包含一行，输出牌面向下的块的个数
示例1
输入
 5
 1 1
 1 2
 3 1
 4 1
 2 2
输出
 1
 0
 1
 2
 0
*
* */

public class reverseNM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] n = new int[t];
        int[] m = new int[t];
        for (int i = 0; i < t; i++) {
            n[i] = scanner.nextInt();
            m[i] = scanner.nextInt();
        }
        int[] temp = solution(n, m);
        for (int a : temp) {
            System.out.println(a);
        }
    }


    public static int[] solution(int[] n, int[] m) {
        int[] result = new int[m.length];
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 1 && m[i] == 1) {
                result[i] = 1;
            } else if (n[i] == 1 && m[i] > 1) {
                result[i] = m[i] - 2;
            } else if (m[i] == 1 && n[i] > 1) {
                result[i] = n[i] - 2;
            } else if (n[i] > 1 && m[i] > 1) {
                result[i] = (n[i] - 2) * (m[i] - 2);
            }

        }
        return result;
    }
}
