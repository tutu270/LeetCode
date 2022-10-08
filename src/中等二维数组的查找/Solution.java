package 中等二维数组的查找;
class Solution {
    public static void main(String[] args) {
        int[][] a = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int[][] b = {{-5}};
        findNumberIn2DArray(b, 5);
    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        if (matrix[0].length==0) {
            return false;
        }

        if (matrix[0][0] == target) {
            return true;
        }

        int row = matrix.length;
        int column = matrix[0].length;

        int mid ;
        for (int i = 0; i < row; i++) {
            int left = 0, right = column - 1;
            while (left <= right) {
                mid = left + (right - left) / 2;
                if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else if (matrix[i][mid] > target) {
                    right = mid-1;
                } else {
                    return true;
                }
            }
        }


        return false;

    }
}


//        left = 0;
//        right = row - 1;
//        for (int i = 0; i < column; i++) {
//            while (left < right) {
//                mid = left + (right - left) / 2;
//                if (matrix[mid][i] < target) {
//                    left = mid + 1;
//                } else if (matrix[mid][i] > target) {
//                    right = mid;
//                } else {
//                    return true;
//                }
//            }
//        }