package 困难统计值字符串的唯一方法;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        uniqueLetterString("LEETCODE");
    }
    public static int uniqueLetterString(String s) {
        Map<Character, List<Integer>> temp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!temp.containsKey(s.charAt(i))) {
                temp.put(s.charAt(i), new ArrayList<>());
            }
            temp.get(s.charAt(i)).add(i);
        }
        int res = 0;
        for (Map.Entry<Character, List<Integer>> entry : temp.entrySet()) {
            int left = -1, right;
            List<Integer> list = entry.getValue();

            for (int i = 0; i < list.size(); i++) {
                right = (i < list.size() - 1) ? list.get(i + 1) : s.length();
                res += (right - list.get(i)) * (list.get(i) - left);
                left = list.get(i);
            }
        }
        return res;
    }
}