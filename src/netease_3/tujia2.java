package netease_3;
/**
 * @Project: nowcoder_test
 * @Package netease_3
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年09月22日 19:58
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 22 19:58
 * @description
 */
public class tujia2 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.println("ping");

    }

    static void pong() {
        System.out.println("pong");
    }
}
