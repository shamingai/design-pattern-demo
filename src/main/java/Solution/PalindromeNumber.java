package Solution;

/**
 * @ClassName: ReverseInteger
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2019/5/23 2:57 PM
 */
//https://leetcode-cn.com/problems/palindrome-number/
public class PalindromeNumber {
    public static void main(String[] args) {
//        int x = -121;
//        int x = 121;
//        int x = 10;
//        int x = 1231;
        int x = 1;
        boolean y = isPalindrome(x);
        System.out.println(y);
    }

    // TODO: 2019/5/27 待优化
    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        String yStr = String.valueOf(x);
        int y = 0;
        for (int i = 0; i < yStr.length() / 2; i++) {
            if (yStr.substring(i, i+1).equals(yStr.substring(yStr.length()-i-1, yStr.length()-i))) {
                y = ++y;
            }

        }
        if (y <= yStr.length() / 2 && y > yStr.length() / 2 - 1) {
            return true;
        }
        return false;
    }

}
