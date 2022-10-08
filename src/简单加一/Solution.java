package 简单加一;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        for (String item : list) {
//            if ("3".equals(item)) {
//
//                list.remove(item);
//            }
//        }
//        Iterator<String> a = list.iterator();
//        while (a.hasNext()) {
//
//            String item = a.next();
//            System.out.println(item+"a");
//            if (item=="3") {
//                System.out.println("a");
//
//                a.remove();
//            }
//        }

        int[] a = {8,9,9,9};
        plusOne(a);
    }
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry = 0;
        for (int i = len - 1; i >= 0; i--) {
            int temp = 0;
            if (i == len - 1) {
                temp = digits[i];
                digits[i] = (digits[i] + 1 + carry) % 10;
                carry = (temp + 1 + carry) / 10;

            } else {
                temp = digits[i];
                digits[i] = (digits[i] + carry) % 10;
                carry = (temp+ carry) / 10;

            }

        }
        if (carry > 0) {
            int[] res = new int[digits.length + 1];
            res[0] = carry;
            for (int i1 = 0; i1 < digits.length; i1++) {
                res[i1 + 1] = digits[i1];
            }
            return res;
        }
        return digits;
    }
}