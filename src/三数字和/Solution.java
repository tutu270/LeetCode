package 三数字和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int x=011;
        System.out.println(x);
        int y = ++x;
        System.out.println(y);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return lists;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int curr = nums[i];
            int l = i + 1, r = len - 1;
            while (l < r) {
                int temp = curr + nums[l] + nums[r];
                if (temp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    lists.add(list);
                    while(l < r && nums[l+1] == nums[l]) ++l;
                    while (l < r && nums[r-1] == nums[r]) --r;
                    ++l;
                    --r;
                } else if(temp < 0) {
                    ++l;
                } else {
                    --r;
                }
            }

        }
        return lists;
    }
}