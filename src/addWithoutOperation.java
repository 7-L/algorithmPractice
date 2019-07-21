/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月15日 14:39
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 15 14:39
 * @description
 */
public class addWithoutOperation {

    public static int Add(int num1, int num2) {
        int sum, cross;
        do {
            sum = num1 ^ num2;
            cross = (num1 & num2) >> 1;
            num1 = sum;
            num2 = cross;

        } while (num2 != 0);
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(Add(28, 7));
    }
}
