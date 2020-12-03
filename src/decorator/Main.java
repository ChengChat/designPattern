package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 装饰者模式：
 * 动态的将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案 。
 * <p>
 * 设计原则：开放-关闭原则
 * 类应该对扩展开发，对修改关闭
 * <p>
 * 此设计模式在 I/O中有很多应用
 */
public class Main {
    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + ":" + darkRoast.cost());
        HouseBlend houseBlend = new HouseBlend();
        Beverage milkHouseBlend = new Milk(houseBlend);
        Beverage mochaMileHouseBlend = new Mocha(milkHouseBlend);
        System.out.println(mochaMileHouseBlend.getDescription() +
                ":" + mochaMileHouseBlend.cost());

    }
}
