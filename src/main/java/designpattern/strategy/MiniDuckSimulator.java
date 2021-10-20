package designpattern.strategy;

import designpattern.strategy.context.Duck;
import designpattern.strategy.context.MallardDuck;
import designpattern.strategy.context.ModelDuck;
import designpattern.strategy.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        System.out.println("==MallardDuck==");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("==ModelDuck==");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
