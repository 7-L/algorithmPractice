package leetcode;
/**
 * @Project: nowcoder_test
 * @Package leetcode
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月16日 9:55
 * @version V1.0
 */

import java.util.Stack;

/**
 * @author hzx
 * @createTime 16 9:55
 * @description 栈实现队列
 */
public class Stack2Queue {
    Stack<Integer> stack;
    Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public Stack2Queue() {
        stack = new Stack<> ();
        stack2 = new Stack<> ();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        int temp = stack2.peek();
        stack2.pop();
        return temp;
    }

    /** Get the front element. */
    public int peek() {
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());

        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (stack2.isEmpty() && stack.isEmpty()) {
            return true;
        }
        return false;
    }
}

