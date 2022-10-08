package 简单重塑矩阵;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length == 0) {
            return mat;
        }
        int[] a = mat[0];
        if (a.length * mat.length != r * c) {
            return mat;
        }
        int indexR = 0;
        int indexC = 0;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (indexC >= a.length) {
                    indexR++;
                    indexC = 0;
                }
                res[i][j] = mat[indexR][indexC];
                indexC++;
            }
        }
        return res;
    }
}