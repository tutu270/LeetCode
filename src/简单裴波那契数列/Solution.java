package 简单裴波那契数列;



class Solution {

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int left = 1;
        int right = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = (left + right) % 1000000007;
            left = right;
            right = sum;
        }
        return sum;
    }


}
