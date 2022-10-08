package 中等最长的数对链;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        int[][] a = {{5,9},{-1,8},{-6,-2},{8,9},{4,8},{3,6},{2,6},{5,9},{-1,6},{-8,-7}};
        int[][] b = {{1,2},{4,5},{7,8}};
        System.out.println(findLongestChain(a));

    }
    public static int findLongestChain(int[][] pairs) {
        int length = pairs.length;


        Arrays.sort(pairs, (a, b) -> (a[1] - b[1]));
        int temp = pairs[0][1], res = 1;
        for (int i = 1; i < length; i++) {
            if (pairs[i][0] > temp) {
                temp = pairs[i][1];
                res++;
            }
        }

        return res;
    }
}


