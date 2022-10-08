package 中等礼物的最大价值;


class Solution {
    public int maxValue(int[][] grid) {
        int column = grid[0].length;
        int row = grid.length;


        for (int i = 1; i < column; i++) {
            grid[0][i] = grid[0][i] + grid[0][i - 1];
        }
        for (int i = 1; i < row; i++) {
            grid[i][0] = grid[i][0] + grid[i - 1][0];
        }
        for (int i = 1; i < row; i++) {
            for (int i1 = 1; i1 < column; i1++) {
                grid[i][i1] = Math.max(grid[i - 1][i1] + grid[i][i1], grid[i][i1 - 1] + grid[i][i1]);
            }
        }
        return grid[row - 1][column - 1];
    }
}