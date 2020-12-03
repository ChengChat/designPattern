package iterator;

import java.awt.*;
import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT","素食 BLT",true,2.99);
        addItem("BLT","BLT",false,3.29);
        addItem("Soup of the day","今日例汤",false,4.24);
        addItem("Hotdog","热狗",false,4.23);
    }

    private void addItem(String name,String description,boolean vegetarian,double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.err.println("Sorry,menu is full! Can't add item to menu");
        } else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems(){
        return menuItems;
    }


    @Override
    public Iterator createIterator() {
        return new DinerIterator(menuItems);
    }
}
