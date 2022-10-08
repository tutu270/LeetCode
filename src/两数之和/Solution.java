package 两数之和;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(nums.length);
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){

            int another = target - nums[i];
            Integer a = hashMap.get(another);
            if(a!=null){
                result[0]=i;
                result[1]=a;
                break;
            }else{
                hashMap.put(nums[i],i);
            }

        }
        return result;
    }
}