package Delegate;

/**
 * @ClassName: DuckModel
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2020/7/24 12:14 AM
 */
public class DuckModel extends Duck{
    public DuckModel() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
