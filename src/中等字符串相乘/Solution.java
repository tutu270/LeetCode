package 中等字符串相乘;

class Solution {
    public static void main(String[] args) {
        multiply("9", "9");
    }
    public static String multiply(String num1, String num2) {
        int carry;
        String res = "0";
        if (num2.equals("0") || num1.equals("0")) {
            return "0";
        }
        for (int i = num2.length() - 1; i >= 0; i--) {
            StringBuilder temp = new StringBuilder();
            carry = 0;
            for (int i1 = 0; i1 < num2.length()-i-1; i1++) {
                temp.append(0);
            }
            int n2 = num2.charAt(i) - '0';
            for (int j = num1.length() - 1; j >= 0||carry!=0; j--) {
                int n1 = j < 0 ? 0 : num1.charAt(j) - '0';
                int produce = (n1 * n2 + carry) % 10;
                temp.append(produce);
                carry = (n1 * n2 + carry) / 10;
            }
            res = addNum(res, temp.reverse().toString());
        }

        return res;

    }

    public static String addNum(String s1, String s2) {
        StringBuilder s = new StringBuilder();
        int carry =0;
        for (int i = s1.length() - 1, j = s2.length() - 1;
             j >= 0 || i >= 0 || carry != 0; i--, j--) {
            int x = i < 0 ? 0 : s1.charAt(i) - '0';
            int y = j < 0 ? 0 : s2.charAt(j) - '0';
            int produce = (x + y + carry) % 10;
            s.append(produce);
            carry = (x + y + carry) / 10;
        }
        return s.reverse().toString();
    }
}