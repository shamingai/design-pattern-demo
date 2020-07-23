package Delegate;

/**
 * @ClassName: FlyNoWay
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2020/7/23 11:43 PM
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
