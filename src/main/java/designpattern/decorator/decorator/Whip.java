package designpattern.decorator.decorator;

import designpattern.decorator.Beverage;

public class Whip extends CondimentDecorator {

    protected Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
