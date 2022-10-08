package 简单第一个只出现一次的字符;

class Solution {
    public char firstUniqChar(String s) {
        if (s.length() == 1 && s.charAt(0) == ' ') {
            return s.charAt(0);
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}