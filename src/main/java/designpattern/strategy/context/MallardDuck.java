package designpattern.strategy.context;

import designpattern.strategy.strategy.fly.FlyWithWings;
import designpattern.strategy.strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck.display");
    }
}
