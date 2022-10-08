package 简单重新排列单词间的空格;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        reorderSpaces("  hello");
    }
    public static String reorderSpaces(String text) {
        if (text.length() == 1) {
            return text;
        }
        String[] word = text.trim().split("\\s+");
        int countSpace = text.length();
        int wordSpace = word.length - 1;
        int temp = 1;
        for (String a:word) {
            countSpace -= a.length();

        }
        if (countSpace == 0 && wordSpace == 0) {
            return word[0];
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            res.append(word[i]);
            if (temp > wordSpace) {
                break;
            }
            temp++;
            for (int j = 0; j < countSpace / wordSpace; j++) {
                res.append(' ');
            }
        }
        if (wordSpace == 0){
            for (int i = 0; i < countSpace; i++) {
                res.append(' ');
            }
        }else if (countSpace % wordSpace > 0  ) {
            for (int i = 0; i < countSpace % wordSpace; i++) {
                res.append(' ');
            }
        }
        return res.toString();

    }
}