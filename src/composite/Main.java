package composite;

/**
 * 组合模式：
 * 允许你将对象组合成树形结构来表现“整体/部分”层次结构。
 * 组合能让客户以一致的对象处理个别对象以及组合对象。
 * <p>
 * 组合结构内的任意对象称为组件，组件可以是组合，也可以是叶节点。
 * <p>
 * 什么是透明性？
 * 通过让组件接口同时包含一些管理子节点和叶节点的操作，客户就可以将组合和叶节点一视同仁。
 *
 * 可与迭代器一起使用
 */
public class Main {

    public static void main(String[] args) {
        MenuComponent breakfast = new Menu("早餐","这个是早餐菜单");
        MenuComponent lunch = new Menu("午餐","这个是午餐菜单");
        MenuComponent dessert = new Menu("甜点","这个是午餐菜单里的甜点菜单");
        MenuComponent dinner = new Menu("晚餐","这个是晚餐菜单");
        MenuComponent allMenu = new Menu("菜单","这个是总菜单");

        allMenu.add(breakfast);
        allMenu.add(lunch);
        allMenu.add(dinner);

        breakfast.add(new MenuItem("K&B Pancake Breakfast","K＆B煎饼早餐",true,2.99));
        breakfast.add(new MenuItem("Regular Pancake Breakfast","煎饼早餐",false,3.29));
        breakfast.add(new MenuItem("Blueberry Pancakes","蓝莓煎饼",true,4.24));
        breakfast.add(new MenuItem("Waffles","威化饼",true,4.23));

        lunch.add(new MenuItem("Vegetarian BLT","素食 BLT",true,2.99));
        lunch.add(new MenuItem("BLT","BLT",false,3.29));
        lunch.add(new MenuItem("Soup of the day","今日例汤",false,4.24));
        lunch.add(new MenuItem("Hotdog","热狗",false,4.23));
        lunch.add(dessert);

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
