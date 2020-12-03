package strategy;

/**
 * 策略模式：
 * 定义了算法组，分别封装起来，让他们直接可以相互替换，此模式让算法的变化独立于使用算法的客户
 *
 * 设计原则：
 * 1. 找出应用中可能需要变化之处，把他们独立出来，不要和那些不需要变化的代码混在一起。
 * 2. 针对接口编程，而不是针对实现编程。
 * 3. 多用组合，少用继承。（“有一个”可能比“是一个”更好）
 *
 * 个人理解：
 * 若有相同的行为，用父类定义。
 * 若父类无法确定行为而子类可以确定，定义抽象父类，抽象方法，通过子类去实现抽象方法。
 * 若子类也无法确定行为，使用策略模式，把无法确定的行为委派出去。
 *
 */
public class Main {
    public static void main(String[] args){
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.fly();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.fly();
    }
}
