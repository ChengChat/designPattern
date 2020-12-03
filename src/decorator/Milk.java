package decorator;

/**
 * 牛奶，加在咖啡中的调料
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Milk";
    }

    @Override
    public double cost() {
        return 10.2 + beverage.cost();
    }
}
