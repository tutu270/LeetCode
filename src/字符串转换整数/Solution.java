package 字符串转换整数;

class Solution {
    public int myAtoi(String s) {
        int length = s.length();
        char[] charArray = s.toCharArray();
        int index = 0;

        /*
        * 去除空格
        * */
        while (index < length && charArray[index] == ' ') {
            index++;
        }

        if (index == length) {
            return 0;
        }

        //判断符号
        int sign = 1;
        char firstChar = charArray[index];
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            index++;
            sign = -1;
        }

        int res = 0;
        while (index < length) {
            char currChar = charArray[index];
            if (currChar > '9' || currChar < '0') {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE / 10 && (currChar - '0')
                            > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 ||
                    (res == Integer.MIN_VALUE / 10 && (currChar - '0')
                            > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (currChar - '0');
            index++;

        }
        return res;
    }
}