package algorithm;
/**
 * @Project: nowcoder_test
 * @Package algorithm
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年09月17日 19:26
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 17 19:26
 * @description
 */
public class baiduRead {
    String str = new String("good");
    char[] chars = {'a', 'b', 'c'};

    public static void main(String[] args) {
        baiduRead baiduRead = new baiduRead();
        baiduRead.change(baiduRead.str, baiduRead.chars);
        System.out.println(baiduRead.str + "and");
        System.out.println(baiduRead.chars);

    }

    private void change(String str, char[] chars) {
        str = "test OK";
        chars[0] = 'g';
    }
}
