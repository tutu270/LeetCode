package 简单用两个栈实现队列;

import java.util.ArrayDeque;
import java.util.Deque;

class CQueue {
    Deque<Integer> inStacker;
    Deque<Integer> outStacker;

    public CQueue() {
        inStacker = new ArrayDeque<Integer>();
        outStacker = new ArrayDeque<Integer>();
    }

    public void appendTail(int value) {
        inStacker.push(value);
    }

    public int deleteHead() {
        if (outStacker.isEmpty()) {
            if (inStacker.isEmpty()) {
                return -1;
            }
            while (!inStacker.isEmpty()) {
                outStacker.push(inStacker.pop());
            }
        }
        return outStacker.pop();
    }
}