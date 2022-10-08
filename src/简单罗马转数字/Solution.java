package 简单罗马转数字;



class Solution {
    public int romanToInt(String s) {
        int temp = 0;
        int res = 0;
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            char index = s.charAt(i);
            switch (index) {
                case 'I':
                    temp = 1;
                    break;
                case 'V':
                    temp = 5;
                    break;
                case 'X':
                    temp = 10;
                    break;
                case 'L':
                    temp = 50;
                    break;
                case 'C':
                    temp = 100;
                    break;
                case 'D':
                    temp = 500;
                    break;
                case 'M':
                    temp = 1000;
                    break;
            }
            if (i < s.length() - 1) {
                char index1 = s.charAt(i+1);
                switch (index1) {
                    case 'I':
                        value = 1;
                        break;
                    case 'V':
                        value = 5;
                        break;
                    case 'X':
                        value = 10;
                        break;
                    case 'L':
                        value = 50;
                        break;
                    case 'C':
                        value = 100;
                        break;
                    case 'D':
                        value = 500;
                        break;
                    case 'M':
                        value = 1000;
                        break;
                }
            }
            if (temp < value) {
                res -= temp;
            } else {
                res += temp;
            }
        }
        return res;
    }
}
