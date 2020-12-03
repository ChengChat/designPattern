package decorator;

/**
 * 摩卡  咖啡的一种调料
 */
public class Mocha extends CondimentDecorator{
    private Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 7.3 + beverage.cost();
    }
}
