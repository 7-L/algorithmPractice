package Practice;
/**
 * @Project: nowcoder_test
 * @Package Practice
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月01日 9:55
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 01 9:55
 * @description
 */
public class TryCatchTest {

    public static void main(String args[]) {
        int num = 10;
        WithException();
        System.out.println(test(num));
    }

    public static int test(int b) {
        try {
            b += 10;
            System.out.println("try");
//            return b;
        } catch (RuntimeException e) {
            System.out.println("RE e");
        } catch (Exception e2) {
            System.out.println("e2");
        } finally {
            b += 10;
            System.out.println("finally");
            return b;
        }
    }

    public static int WithException(){
        int i=10;
        try{
            System.out.println("i in try block is ： "+i);
            i = i/0;
            return --i;
        }
        catch(Exception e){
            System.out.println("i in catch - form try block is ： "+i);
            --i;
            System.out.println("i in catch block is ： "+i);
            return --i;
        }
        finally{
            System.out.println("i in finally - from try or catch block is--"+i);
            --i;
            System.out.println("i in finally block is--"+i);
            return --i;
        }
    }
}
