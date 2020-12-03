package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{
    int numberOfItems = 0;
    private List<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B Pancake Breakfast","K＆B煎饼早餐",true,2.99);
        addItem("Regular Pancake Breakfast","煎饼早餐",false,3.29);
        addItem("Blueberry Pancakes","蓝莓煎饼",true,4.24);
        addItem("Waffles","威化饼",true,4.23);
    }

    private void addItem(String name,String description,boolean vegetarian,double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
