package 简单字符串中的第一个唯一字符;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        firstUniqChar("leetcode");
    }
    public static int firstUniqChar(String s) {
        Map<Character, Integer> temp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = temp.getOrDefault(s.charAt(i), 0)+1;
            temp.put(s.charAt(i), count);
        }
        for (int i = 0; i < s.length(); i++) {
            if (temp.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}