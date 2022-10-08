package 有效地括号;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> left =new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                left.push(c);
            } else {
                if (!left.empty() && leftof(c) == left.peek()) {
                    left.pop();
                }else {
                    return false;
                }
            }
        }
        return left.empty();
    }

    char leftof(char c) {
        if (c==')') return '(';
        if (c=='}') return '{';
        return '[';
    }
}