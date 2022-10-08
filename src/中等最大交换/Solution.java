package 中等最大交换;


import java.util.Arrays;


class Solution {

    public int maximumSwap(int num) {

        if (num < 10) {
            return num;
        }
        char[] temp = String.valueOf(num).toCharArray();
        for (int i = 0; i < temp.length - 1; i++) {
            int res = temp[i]-'0';
            int index = 0;
            for (int i1 = temp.length-1; i1 >=i+1 ; i1--) {
                if (temp[i1] - '0' > res) {
                    res = temp[i1] - '0';
                    index = i1;
                }
            }
            if (index != 0) {
                char a = temp[i];
                temp[i] = temp[index];
                temp[index] = a;
                break;

            }
        }
        return Integer.parseInt(new String(temp));
    }

}