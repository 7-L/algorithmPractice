/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月19日 12:47
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 19 12:47
 * @description
 */
public class thread {

    private long count = 0;

    private synchronized void incCount() {
        count++;
    }

    private static class Count extends Thread {
        private thread thread1;

        public Count(thread thread1) {
            this.thread1 = thread1;
        }

        public void run() {
            for (int i = 0; i < 10000; i++) {
                thread1.incCount();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        thread thread2 = new thread();

        Count count1 = new Count(thread2);
        Count count2 = new Count(thread2);

        count1.start();
        count2.start();

        Thread.sleep(50);
        System.out.println(thread2.count);

    }

}
