package Delegate;

/**
 * @ClassName: FlyWithWings
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2020/7/23 11:41 PM
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!");
    }
}
