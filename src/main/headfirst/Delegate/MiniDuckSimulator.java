package Delegate;

/**
 * @ClassName: MiniDuckSimulator
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2020/7/23 11:49 PM
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new Duck();
        mallard.performQuack();
        mallard.performFly();
    }
}
