package netease_3;
/**
 * @Project: nowcoder_test
 * @Package netease_3
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年09月23日 19:09
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 23 19:09
 * @description
 */
public class xindongfang1 {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = new Integer(100);
        int c = 100;
        Integer a1 = 200;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a1 == a + b);

    }
}
