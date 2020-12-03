package state;

public class WinnerState extends State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void dispense() {
        System.out.println("恭喜你中奖了，可以得到两个糖果！");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            System.out.println("不好意思，糖果售尽了。。。");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else{
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
