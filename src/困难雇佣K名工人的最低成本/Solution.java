package 困难雇佣K名工人的最低成本;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] a = {3,1,10,10,1};
        int[] b = {4,8,2,2,7};
        mincostToHireWorkers(a, b, 3);
    }

    public static double mincostToHireWorkers(int[] qs, int[] ws, int k) {
        int n = qs.length;
        double[][] ds = new double[n][2];
        for (int i = 0; i < n; i++) {
            ds[i][0] = ws[i] * 1.0 / qs[i]; ds[i][1] = i * 1.0;
        }
        Arrays.sort(ds, (a,b)->Double.compare(a[0], b[0]));
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        double ans = 1e18;
        for (int i = 0, tot = 0; i < n; i++) {
            int cur = qs[(int)ds[i][1]];
            tot += cur; q.add(cur);
            if (q.size() > k) tot -= q.poll();
            if (q.size() == k) ans = Math.min(ans, tot * ds[i][0]);
        }
        System.out.println(ans);
        return ans;
    }


}

