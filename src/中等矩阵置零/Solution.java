package 中等矩阵置零;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[][] a = {{3,7,2,8,2},{2,2,4,1,8},{0,5,7,6,3},{8,1,0,7,7},{1,3,7,4,1},{6,5,5,6,3},{7,1,0,1,9}
        ,{5,4,4,9,7},{2,2,4,1,0},{7,1,1,9,1},{8,0,4,7,6},{7,5,1,2,3},{7,2,5,9,3}};
        setZeroes(a);

    }
    public static void setZeroes(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
//        StringBuilder s = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[0].length; i1++) {
                if (matrix[i][i1] == 0) {
                    list.add(i);
                    list.add(i1);
                }
            }
        }
        for (int i = 0; i < list.size(); i = i + 2) {
            for (int i1 = 0; i1 < matrix[0].length; i1++) {
                matrix[list.get(i)][i1] = 0;

            }
        }
        for (int i = 1; i < list.size(); i = i + 2) {
            for (int i1 = 0; i1 < matrix.length; i1++) {
                matrix[i1][list.get(i)] = 0;
            }
        }
    }
}