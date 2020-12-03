package adapter;

/**
 * 适配器模式：
 * 将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。
 * <p>
 * 适配器模式将一个或多个类接口变成客户所期望的一个接口。
 * <p>
 * “对象”适配器和“类”适配器（类适配器需要用到多重继承，java不能实现）
 * <p>
 * 适配器模式和外观模式的意图不同：
 * 适配器模式的意图是：“改变”接口使符合客户的期望；
 * 外观模式的意图是：提供子系统的一个简化接口。
 * <p>
 * 适配器模式、装饰者模式、外观模式：
 * 适配器将一个对象包装起来以改变其接口；
 * 装饰者将一个对象包装起来以增加新的行为和责任；
 * 外观将一群对象“包装”起来以简化其接口。
 */
public class Main {
    public static void main(String[] args) {
        WildTurkey wildTurkey = new WildTurkey();
        wildTurkey.gobble();
        wildTurkey.fly();

        MallardDuck mallardDuck = new MallardDuck();
        testDuck(mallardDuck);

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
