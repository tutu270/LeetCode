package 简单x的平方根;

import java.util.Arrays;

class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x;
        int mid ;
        int ans = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if ((long )mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}