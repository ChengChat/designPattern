package command.command;

import command.receiver.CeilingFan;
import command.receiver.Light;

public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
