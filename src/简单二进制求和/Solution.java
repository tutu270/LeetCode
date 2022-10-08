package 简单二进制求和;

class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        StringBuilder res = new StringBuilder();
        while (aIndex >= 0 || bIndex >= 0) {
            int temp1;
            int temp2;
            int temp;
            if (aIndex < 0) {
                temp2 = b.charAt(bIndex--) - '0';
                temp = temp2 + carry;
                carry = temp >= 2 ? 1 : 0;
                if (temp % 2 == 0) {
                    res.append('0');
                } else if (temp % 2 == 1) {
                    res.append('1');
                }
            } else if (bIndex < 0) {
                temp1 = a.charAt(aIndex--) - '0';
                temp = temp1 + carry;
                carry = temp >= 2 ? 1 : 0;
                if (temp % 2 == 0) {
                    res.append('0');
                } else if (temp % 2 == 1) {
                    res.append('1');
                }
            } else {
                temp1 = a.charAt(aIndex--) - '0';
                temp2 = b.charAt(bIndex--) - '0';
                temp = temp1 + temp2 + carry;
                carry = temp >= 2 ? 1 : 0;
                if (temp % 2 == 0) {
                    res.append('0');
                } else if (temp % 2 == 1) {
                    res.append('1');
                }
            }

        }
        if (carry == 1) {
            res.append('1');
        }
        return res.reverse().toString();
    }
}
