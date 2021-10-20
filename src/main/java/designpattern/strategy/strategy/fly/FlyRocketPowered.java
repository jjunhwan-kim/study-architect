package designpattern.strategy.strategy.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyRocketPowered.fly");
    }
}
