package 困难不同的子序列2;

public class Solution {
        int MOD = (int)1e9+7;
        public int distinctSubseqII(String s) {
            int n = s.length(), ans = 0;
            int[][] f = new int[n + 1][26];
            for (int i = 1; i <= n; i++) {
                int c = s.charAt(i - 1) - 'a';
                for (int j = 0; j < 26; j++) {
                    if (c != j) {
                        f[i][j] = f[i - 1][j];
                    } else {
                        int cur = 1;
                        for (int k = 0; k < 26; k++) cur = (cur + f[i - 1][k]) % MOD;
                        f[i][j] = cur;
                    }
                }
            }
            for (int i = 0; i < 26; i++) ans = (ans + f[n][i]) % MOD;
            return ans;
        }
}