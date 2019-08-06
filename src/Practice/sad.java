package Practice;
/**
 * @Project: nowcoder_test
 * @Package Practice
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月03日 15:30
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 03 15:30
 * @description
 */
public class sad {
    public static void main(String[] args) {
        App a = new b();
        a.f();
        System.out.println(a.getClass().getName());
        try {
            b b = (b) a;
            b.g();
        } catch (Exception e) {
            System.out.println("e");
        }
    }
}

class b implements App{
    public void f() {
        System.out.println("Bf");
    }

    public void g() {
        System.out.println("Bg");
    }

}

interface App {
    void f();
}



