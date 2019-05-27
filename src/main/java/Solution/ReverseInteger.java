package Solution;

/**
 * @ClassName: ReverseInteger
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2019/5/23 2:57 PM
 */
public class ReverseInteger {
    public static void main(String[] args) {
//        int x = -2147483648;
        int x = 1534236469;
//        int x = 123;
        int y = reverse(x);
        System.out.println(y);
    }

    // 版本 2 用其它数据类型扩展可计算的数值
    public static int reverse(int x) {

        // 新数值 每次上涨一位
        // 原数值 取得最后一位数值，放到 新数值 的最后一位
        // 原数值削一位，依次循环
        long y = 0;
        while (x != 0) {
            // 当前数值 = 10整除取余
            y = 10 * y + x % 10;
            x /= 10;
        }
        return (y > (int)Math.pow(2, 31) - 1 || y < -(int)Math.pow(2, 31)) ? 0 : (int) y;

    }

//    // 版本 1 用 string 做中间转换，数值类型用其它数值计算可能更好
//    // 坑 1，(int)Math.pow(10, 9) * 9 = 负数
//    // Integer.Reverse 是进制流的转换
//    public int reverse(int x) {
//        if (x > (int)Math.pow(2, 31) - 1 || x <= -(int)Math.pow(2, 31)) {
//            return 0;
//        }
//
//        int isPositive = 1;
//        int y = x;
//
//        // 打标并统一成正数
//        if (x < 0) {
//            isPositive = -1;
//            y = -x;
//        }
//
//        String yStr = String.valueOf(y);
//        int h = 0;
//        StringBuilder c = new StringBuilder();
//        for(int i = 0; i < yStr.length() ; i++ ){
//            // 当前数值
//            String s = yStr.substring(i, i+1);
//
//            StringBuilder sb = new StringBuilder().append(s);
//            c = sb.append(c);
//        }
//        try {
//            h = Integer.valueOf(c.toString()) * isPositive;
//        } catch (IllegalArgumentException e){
//            return 0;
//        }
//        return h;
//    }
}
