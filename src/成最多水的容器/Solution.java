package 成最多水的容器;

class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int res = 0;
        while (l < r) {
            int cur_area = Math.min(height[l], height[r]) * (r - l);
            res = Math.max(res, cur_area);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }

}