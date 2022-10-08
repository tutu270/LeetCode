package 相似的为k的字符串;

class Solution {
    int result = Integer.MAX_VALUE;
    public int kSimilarity(String s1, String s2) {
        return execute(s1.toCharArray(), s2.toCharArray(), 0, 0);
    }

    public int execute(char[] sc1, char[] sc2, int start, int current) {
        if (current >= result) return result; // 如果交换次数已经超过"目前最小交换次数result"，终止递归
        if (start == sc1.length - 1) return result = Math.min(current, result);

        for (int i = start; i < sc1.length; i++) {
            if (sc1[i] != sc2[i]) {
                for (int j = i + 1; j < sc2.length; j++) {
                    if (sc2[j] == sc1[i] && sc2[j] != sc1[j]) {
                        swap(sc2, i, j); // 交换
                        execute(sc1, sc2, i + 1, current + 1);
                        swap(sc2, i, j); // 回溯
                    }
                }
                return result;
            }
        }
        return result = Math.min(current, result);
    }

    public void swap(char[] sc, int i, int j){
        char temp = sc[i];
        sc[i] = sc[j];
        sc[j] = temp;
    }
}

