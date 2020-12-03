package strategy;

public class ModelDuck extends Duck {
    public ModelDuck(){
        super.flyBehavior = new FlyNoWay();
    }
}
