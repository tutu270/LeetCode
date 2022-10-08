package 简单最后一个字符串的长度;


class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        int end = s.length() - 1;
        while (end > 0 && s.charAt(end) == ' '){
            end--;
        }

        if (end < 0) return 0;
        while (end >= 0 && s.charAt(end--) != ' ') {
            res++;
        }
        return res;
    }
}