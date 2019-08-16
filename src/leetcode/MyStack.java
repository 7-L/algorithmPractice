package leetcode;
/**
 * @Project: nowcoder_test
 * @Package leetcode
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月16日 10:52
 * @version V1.0
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hzx
 * @createTime 16 10:52
 * @description  两个队列实现栈（暂未完成）
 */
class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int top;
    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<> ();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.add(x);
        }
        if (queue1.isEmpty()) {
            queue2.add(x);
        }
        if (queue2.isEmpty()) {
            queue1.add(x);
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            try {
                throw new Exception("both queue is empty");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (queue1.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }
        if (queue2.isEmpty()) {
            while (queue1.size() > 0) {
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }
        return (Integer)null;
    }


    /**
     * Get the top element.
     */
    public int top() {
        return 0;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */