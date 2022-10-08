package 简单字符串相加;


class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder res = new StringBuilder();
        int temp;
        int l = num1.length() - 1, r = num2.length() - 1;
        while (l >= 0 || r >= 0) {
            if (l < 0) {
                temp = (num2.charAt(r--) - '0') + carry;
                carry = temp / 10;
                res.append(temp % 10);
            } else if (r < 0) {
                temp = (num1.charAt(l--) - '0')  + carry;
                carry = temp / 10;
                res.append(temp % 10);
            } else {
                temp = (num1.charAt(l--) - '0') + (num2.charAt(r--) - '0') + carry;
                carry = temp / 10;
                res.append(temp % 10);
            }
        }
        if (carry != 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }
}