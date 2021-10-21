package designpattern.decorator.decorator;

import designpattern.decorator.Beverage;

public class Milk extends CondimentDecorator {

    protected Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
