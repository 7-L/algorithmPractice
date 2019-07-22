package algorithm;
/**
 * @Project: nowcoder_test
 * @Package algorithm
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月22日 15:42
 * @version V1.0
 */

import java.util.Stack;

/**
 * @author hzx
 * @createTime 22 15:42
 * @description 实现一个栈, 支持以下操作:
 * <p>
 * push(val) 将 val 压入栈
 * pop() 将栈顶元素弹出, 并返回这个弹出的元素
 * min() 返回栈中元素的最小值
 * 要求 O(1) 开销.
 * <p>
 * 保证栈中没有数字时不会调用 min()
 */
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int number) {
        stack.push(number);
        if (minStack.isEmpty()) {
            minStack.push(number);
        } else {
            minStack.push(Math.max(number, minStack.peek()));
        }
    }

    public int pop() {
        minStack.pop();
        return stack.pop();
    }

    public int min() {
        return minStack.peek();
    }
}
