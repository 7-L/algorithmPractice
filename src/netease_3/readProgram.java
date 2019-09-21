package netease_3;
/**
 * @Project: nowcoder_test
 * @Package netease_3
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年09月21日 15:03
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 21 15:03
 * @description
 */
public class readProgram {
    public static void main(String[] args) {
        int i = 0;
        int res = 1;
        while (true) {
            try {
                res += res / (i++);
                System.out.println("NO EXCE");

            } catch (Exception e) {
                System.out.println("ZERO exce");

            }finally {

                System.out.println("In Finally");
                System.out.println(i);
                if (i == 2) {
                    break;

                }
            }
        }
    }
}
