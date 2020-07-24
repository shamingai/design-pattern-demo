package Delegate;

/**
 * @ClassName: QuackMute
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2020/7/23 11:46 PM
 */
public class QuackMute implements QuackBehavior {
    public void quack() {
        System.out.println("《Silence》");
    }
}
