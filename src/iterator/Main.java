package iterator;

import java.util.ArrayList;

/**
 * 迭代器模式：
 * 提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。
 *
 * 设计原则：单一责任：
 * 一个类应该只有应该引起变化的原因。尽量让每个类保持单一职责。
 */
public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
