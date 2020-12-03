package state;

/**
 * 状态模式：
 * 允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。
 *
 * 状态模式和策略模式由相同的类图，但是它们的意图不同。
 */
public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        for (int i = 0; i < 5; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine + "\n");
        }
    }
}
