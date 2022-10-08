package 简单左旋转字符串;


class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        res.append(s.substring(n));
        res.append(s.substring(0, n));
        return res.toString();
    }
}