package Delegate;

/**
 * @ClassName: DuckMallard
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2020/7/23 11:56 PM
 */
public class DuckMallard extends Duck {
    public DuckMallard() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real DuckMallard");

    }

}
