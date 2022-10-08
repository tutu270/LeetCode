package 中等优美的排序;

class Solution {
    public int[] constructArray(int n, int k) {
        int temp = 1;
        int index = 0;
        int[] res = new int[n];
        for (int i = 20; i > 0; i--) {
            if (temp != k) {
                res[index++] = temp;
                temp++;
                res[index++] = i+1;
            }
        }
        return res;
    }
}