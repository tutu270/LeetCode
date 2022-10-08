package 简单杨辉三角;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        int value = 0;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    value = res.get(i-1).get(j-1)+ res.get(i-1).get(j);
                    temp.add(value);
                }

            }
            res.add(temp);

        }
        return res;
    }
}