package Delegate;

/**
 * @ClassName: MuteQuack
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2020/7/23 11:46 PM
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("《《Silence》》");
    }
}
