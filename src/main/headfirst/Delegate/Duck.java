package Delegate;

/**
 * @ClassName: Duck
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2020/7/23 11:38 PM
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
