package 简单替换空格;


class Solution {
    StringBuilder res = new StringBuilder();
    public String replaceSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res.append('%');
                res.append('2');
                res.append('0');
            } else {
                res.append(s.charAt(i));
            }

        }
        return res.toString();
    }
}