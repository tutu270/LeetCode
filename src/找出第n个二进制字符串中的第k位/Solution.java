package 找出第n个二进制字符串中的第k位;

class Solution {
    public static void main(String[] args) {
        findKthBit(3,2);
    }
    public static char findKthBit(int n, int k) {
        if (k == 1) {
            return '0';
        }
        StringBuilder s = new StringBuilder();
        s.append("0");
        for (int i = 1; i < n; i++) {
            if (s.length() > k) {
                break;
            }
            int index = s.length() - 1;
            s.append("1");
            while (index >= 0) {
                char a = s.charAt(index--) == '0' ? '1' : '0';
                s.append(a);
            }
        }
        return s.charAt(k - 1);

    }


}