package state;

public class SoldOutState extends State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String toString() {
        return "当前状态：糖果售完";
    }
}
