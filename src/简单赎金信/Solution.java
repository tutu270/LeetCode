package 简单赎金信;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi");
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> temp = new HashMap<>();
        int res = ransomNote.length();
        int count;
        for (int i = 0; i < ransomNote.length(); i++) {
            count = 0;
            count = temp.getOrDefault(ransomNote.charAt(i), 0) + 1;
            temp.put(ransomNote.charAt(i), count);
        }
        for (int i = 0; i < magazine.length(); i++) {
            count = 0;
            if (temp.containsKey(magazine.charAt(i))) {
                if (temp.get(magazine.charAt(i)) > 0) {
                    res--;
                    count = temp.get(magazine.charAt(i))-1;
                    temp.put(magazine.charAt(i), count);
                }

            }
        }
        return res > 0 ? false : true;
    }
}