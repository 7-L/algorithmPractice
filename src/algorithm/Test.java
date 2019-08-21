package algorithm;
/**
 * @Project: nowcoder_test
 * @Package algorithm
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月21日 15:01
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 21 15:01
 * @description
 */
public class Test {
    static {
        System.out.println("1");
    }

    public Test() {
        System.out.println("2");
    }

    public void print() {
        System.out.println("3");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("4");
        Test test = new Test();
        test.print();
        System.out.println("5");

        try {
            System.out.println("1");
            if (true) {
                throw new Exception("erroe");
            }
            System.out.println("2");
        }
        catch (Exception e) {
            System.out.println("3");

        }finally {
            System.out.println("4");
        }
    }
}
