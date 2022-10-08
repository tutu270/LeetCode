package 简单旋转数组的最小数字;


import java.util.Arrays;

class Solution {
    public int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}