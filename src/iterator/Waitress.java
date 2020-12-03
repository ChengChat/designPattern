package iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    private List<Menu> menuList;

    public Waitress(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void printMenu() {
        Iterator<Menu> iterator = menuList.iterator();
        while (iterator.hasNext()) {
            Menu next = iterator.next();
            printMenu(next.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem);
        }
    }
}
