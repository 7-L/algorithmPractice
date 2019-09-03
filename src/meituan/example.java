package meituan;
/**
 * @Project: nowcoder_test
 * @Package meituan
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年09月02日 18:09
 * @version V1.0
 */

import java.io.IOException;

/**
 * @author hzx
 * @createTime 02 18:09
 * @description
 */
public class example {
    public static void main(String[] args) {
        Demo demo = new Demo();
        example example = new example();
        String result = example.fun1(demo);
        System.out.println(result);
        String a1 = "a";
        String a2 = new String("a");
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
    }

    private String fun1(Demo demo) {
        try {
            demo.str += "1";
            return fun2(demo);
        }finally {

            demo.str += "2";
            return demo.str;
        }
    }

    private String fun2(Demo demo) {
        try {
            demo.str += "3";
            return demo.str;
        }finally {
            demo.str += "4";
        }
    }

    static class Demo {
        String str = "";
    }

}


class ExceptionTest{
    public  int methodA() throws IOException {
        System.out.println("methodA");
        throw new IOException();
    }

    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.methodA();
        } catch (IOException e) {
            System.out.println("IOException");
            throw new IndexOutOfBoundsException();
        } catch (Exception e) {
            System.out.println("catch exc");

        }finally {
            System.out.println("finish");
        }
    }
}
