package state;

public class NoQuarterState extends State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("插入了25美分");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public String toString() {
        return "当前状态：等待插入一个硬币";
    }
}
