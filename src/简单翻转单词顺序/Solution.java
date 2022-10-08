package 简单翻转单词顺序;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        reverseWords("the sky is blue");
    }
    public static String reverseWords(String s) {
        s = s.trim();
        List<String> res = Arrays.asList(s.split("\\s+"));
        System.out.println(res.size());
        Collections.reverse(res);
        return String.join(" ", res);
    }
}