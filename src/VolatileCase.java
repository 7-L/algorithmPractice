/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月19日 13:05
 * @version V1.0
 */

import java.util.Random;

/**
 * @author hzx
 * @createTime 19 13:05
 * @description
 */
public class VolatileCase {
    private static volatile int a = 0;

    private static class VolatileVar implements Runnable {

        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName()+ ":-----------------" + a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileVar volatileVar = new VolatileVar();

        Random r = new Random();

        Thread t1 = new Thread(volatileVar);

        Thread t2 = new Thread(volatileVar);
        Thread t3 = new Thread(volatileVar);
        Thread t4 = new Thread(volatileVar);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Thread.sleep(100);
        while (true) {
            Thread.sleep(399);
            System.out.println(Thread.currentThread().getName()+ ":-------------" + (a = a+r.nextInt(100)));
        }

    }

}
