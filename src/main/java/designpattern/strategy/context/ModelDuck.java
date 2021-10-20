package designpattern.strategy.context;

import designpattern.strategy.strategy.fly.FlyNoWay;
import designpattern.strategy.strategy.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("ModelDuck.display");
    }
}
