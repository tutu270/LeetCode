package 简单二进制矩阵中的特殊位置;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] a = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        numSpecial(a);

    }
    public static int numSpecial(int[][] mat) {
        int[] row = new int[mat.length];
        int[] column = new int[mat[0].length];
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int i1 = 0; i1 < mat[0].length; i1++) {
                row[i] += mat[i][i1];
                column[i1] += mat[i][i1];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int i1 = 0; i1 < mat[0].length; i1++) {
                if (mat[i][i1] == 1 && row[i] == 1 && column[i1] == 1) {
                    sum++;
                }
            }
        }
        return sum;

    }
}