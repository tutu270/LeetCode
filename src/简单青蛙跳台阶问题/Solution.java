package 简单青蛙跳台阶问题;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {

            return 0;
        }
        int[][] sell = new int[prices.length][2];
        sell[0][0] =0;
        sell[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            sell[i][0] = Math.max(sell[i - 1][0], prices[i] + sell[i - 1][1]);
            sell[i][i] = Math.max(sell[i - 1][1], -prices[i]);
        }
        return sell[prices.length - 1][0];
    }
}