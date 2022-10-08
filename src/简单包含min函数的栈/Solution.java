package 简单包含min函数的栈;

import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {

    /**
     * initialize your data structure here.
     */
    Deque<Integer> in;
    Deque<Integer> out;
    public MinStack() {
        in = new ArrayDeque<Integer>();
        out = new ArrayDeque<Integer>();
    }

    public void push(int x) {
        in.push(x);

    }

    public void pop() {
        in.pop();
    }

    public int top() {
        return in.peek();
    }

    public int min() {
        int min = in.peek();
        while (!in.isEmpty()) {
            min = Math.min(in.peek(), min);
            out.push(in.pop());
        }
        while (!out.isEmpty()) {
            in.push(out.pop());
        }
        return min;
    }
}