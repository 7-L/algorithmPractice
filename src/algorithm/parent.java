package algorithm;
/**
 * @Project: nowcoder_test
 * @Package algorithm
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年09月17日 19:15
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 17 19:15
 * @description
 */
public class parent {
    private static final String Parent = "parent";
    private static final String CHILD = "child";
    public parent(){
        System.out.println(Parent + "A");
    }
    static {
        System.out.println(Parent + "B");
    }
    {
        System.out.println(Parent + "C");
    }

    static class Chile extends parent {
        public Chile() {
            System.out.println(CHILD + "A");

        }

        static{
            System.out.println(CHILD + "B");
        }
        {
            System.out.println(CHILD+"C");
        }
    }

    public static void main(String[] args) {
        Chile chile = new Chile();
    }
}
