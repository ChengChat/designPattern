package strategy;

public abstract class Duck {
    //因为这两个行为可变，所以将鸭子这两个行为“委派”给其他类处理
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }

    public void fly(){
        this.flyBehavior.fly();
    }

    public void quack(){
        this.quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
