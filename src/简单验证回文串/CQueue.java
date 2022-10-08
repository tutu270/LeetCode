package 简单验证回文串;

class Solution {
    public static void main(String[] args) {
        String a = "0P";
        isPalindrome(a);
    }
    public static boolean isPalindrome(String s) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                temp.append(s.charAt(i));
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                temp.append(s.charAt(i));
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                temp.append(s.charAt(i));
            }

        }
        System.out.println(temp.toString());
        String s1 = temp.toString().toLowerCase();
        System.out.println(s1);
        int l = 0, r = s1.length() - 1;
        while (l <= r) {
            if (s1.charAt(l) == s1.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }


        return true;
    }
}