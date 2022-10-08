package 简单猜数字大小;


//public class Solution extends GuessGame {
//
//    public int guessNumber(int n) {
//        int left = 1, right = n;
//        int mid = left + (right - left) / 2;
//        while (left < right) {
//            if (guess(mid) <= 0) {
//                right = mid ;
//                mid = left + (right - left) / 2;
//            }else  {
//                left = mid + 1;
//                mid = left + (right - left) / 2;
//            }
//        }
//        return left;
//    }
//
//}