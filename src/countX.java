/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年06月11日 14:06
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 11 14:06
 * @description
 */
class countX1 {
    static int count = 0;

     void main() {
        int i;
        i = x(x(8));
    }

    static int x(int n) {
        System.out.println("count = " + count++);
        if (n <= 3) {
            return 1;
        } else {
            return x(n - 2) + x(n - 4) + 1;
        }
    }
}

public class countX{
    public static void main(String[] args) {
        countX1 countX1 = new countX1();
        countX1.main();
    }
}
