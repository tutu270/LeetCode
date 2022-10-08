package 商品折扣后的最终价格;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] a = {10, 1, 1, 6};
        finalPrices(a);
    }
    public static int[] finalPrices(int[] prices) {
        int left = 0, right = 0;
        int[] res = new int[prices.length];
        int temp = 0;
        for (int i = 0; i < prices.length; i++) {
            temp = prices[i];
            left = i;
            right = i + 1;
            while (right < prices.length) {
                if (prices[left] >= prices[right]) {
                    temp = prices[left] - prices[right];
                    break;
                }
                right++;
            }
            res[i] = Math.min(prices[i], temp);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}