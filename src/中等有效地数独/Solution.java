package 中等有效地数独;

import java.util.Arrays;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] column = new int[9][9];
        int[][][] block = new int[3][3][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] >= '1' && board[i][j] <= '9') {
                    int index = board[i][j] - '0' - 1;
                    row[i][index]++;
                    column[j][index]++;
                    block[i / 3][j / 3][index]++;
                    if (row[i][index] > 1 || column[j][index] > 1 || block[i / 3][j / 3][index] > 1) {

                        return false;
                    }
                }

            }
        }
        return true;
    }
}