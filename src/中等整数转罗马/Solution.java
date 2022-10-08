package 中等整数转罗马;



class Solution {
    StringBuilder s = new StringBuilder();
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                s.append(symbols[i]);
            }
            if (num == 0) {
                break;
            }
        }
        return s.toString();
    }

//    private  void getValue(int c) {
//
//        switch (c) {
//            case 1:
//                s.append('I');
//                break;
//            case 4:
//                s.append('I');
//                s.append('v');
//                break;
//            case 5:
//                s.append('V');
//                break;
//            case 9:
//                s.append('I');
//                s.append('x');
//                break;
//            case 10:
//                s.append('X');
//                break;
//            case 50:
//                s.append('L');
//                break;
//            case 100:
//                s.append('C');
//                break;
//            case 500:
//                s.append('D');
//                break;
//            case 1000:
//                s.append('M');
//                break;
//        }
//
//    }
}
