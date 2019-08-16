package leetcode;
/**
 * @Project: nowcoder_test
 * @Package leetcode
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月16日 10:32
 * @version V1.0
 */

import java.util.Stack;

/**
 * @author hzx
 * @createTime 16 10:32
 * @description
 */
public class leetcode232ans {

    Object transLock = new Object();
    Stack<Integer> input;
    Stack<Integer> output;

    /**
     * Initialize your data structure here.
     */
    public leetcode232ans() {
        input = new Stack();
        output = new Stack();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        synchronized (transLock) {
            input.push(x);
        }
    }

    private void trans() {
        while (input.size() > 0) {
            output.push(input.pop());
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (output.size() == 0) {
            synchronized (transLock) {
                trans();
            }
        }
        return output.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (output.size() == 0) {
            synchronized (transLock) {
                trans();
            }
        }
        return output.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        if (input.size() == 0 && output.size() == 0)
            return true;
        else
            return false;
    }



/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

}
