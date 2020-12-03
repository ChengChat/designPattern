package command.remote;

import command.command.Command;
import command.command.NoCommand;

import java.util.Arrays;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        this.onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot){
        this.offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n---------- Remote Control -------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName() +
                    "   " + offCommands[i].getClass().getName() + "\n");
        }

        return sb.toString();
    }
}
