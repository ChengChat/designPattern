package state;

import java.util.Random;

public class HasQuarterState extends State {

    private GumballMachine gumballMachine;
    Random random = new Random();

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void turnCrank() {
        System.out.println("转动曲柄");
        int i = random.nextInt(5);
        // 有20%的概率中奖，可以出两个糖果。
        if(i == 0 && gumballMachine.getCount() >= 2){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public String toString() {
        return "当前状态：已经插入一个硬币";
    }
}
