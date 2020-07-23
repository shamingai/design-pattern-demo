package Delegate;

import Delegate.QuackBehavior;

/**
 * @ClassName: Delegate.Quack
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2020/7/23 11:45 PM
 */
public class Quack implements QuackBehavior{
    public void quack() {
        System.out.println("Delegate.Quack");
    }
}
