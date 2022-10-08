package 最长公共前缀;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        int index = 0;
        for (int i = 1; i < strs.length; i++) {
            index = 0;
            while (index < strs[i].length() && index < ans.length()) {
                if (ans.charAt(index) == strs[i].charAt(index)) {
                    index++;
                } else {
                    break;
                }

            }

            ans = ans.substring(0, index);
            if (ans.isEmpty()) {
                return ans;
            }
        }
        return ans;
    }
}