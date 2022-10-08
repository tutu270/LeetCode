package 简单用队列实现栈;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


class MyStack {
    Queue<Integer> inStacker;
    Queue<Integer> outStacker;
    public MyStack() {
        inStacker = new LinkedList<Integer>();
        outStacker = new LinkedList<Integer>();
    }

    public void push(int x) {
        inStacker.add(x);
        while (!outStacker.isEmpty()) {
            inStacker.add(outStacker.poll());
        }
        Queue<Integer> temp = outStacker;
        outStacker = inStacker;
        inStacker = temp;
    }

    public int pop() {
        return outStacker.poll();
    }

    public int top() {
        return outStacker.peek();
    }

    public boolean empty() {
        return outStacker.isEmpty();
    }
}