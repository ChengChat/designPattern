package decorator;

/**
 * 深培咖啡
 */
public class DarkRoast extends Beverage {


    public DarkRoast(){
        super.description = "Dark roast coffee";
    }

    @Override
    public double cost() {
        return 23.5;
    }
}
