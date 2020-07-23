package Delegate;

/**
 * @ClassName: MallardDuck
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2020/7/23 11:56 PM
 */
public class MallardDuck extends Duck {
    quackBehavior = new Quack();
    flyBehavior = new FlyNoWay();

    public void display() {

    }
}
