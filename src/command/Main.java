package command;

import command.command.*;
import command.receiver.CeilingFan;
import command.receiver.Light;
import command.receiver.Stereo;
import command.remote.RemoteControl;
import command.remote.SimpleRemoteControl;

/**
 * 命令模式：
 * 将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销操作。
 * <p>
 * 一个命令对象通过在特定接收者上绑定一组动作来封装一个请求。要达到这一点，命令对象将动作和接收者包进对象中。
 */
public class Main {
    public static void main(String[] args) {
        /*SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        simpleRemoteControl.setCommand(lightOffCommand);
        simpleRemoteControl.buttonWasPressed();*/

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        CeilingFan ceilingFan = new CeilingFan();
        Stereo stereo = new Stereo();

        remoteControl.setCommands(0,new LightOnCommand(light),new LightOffCommand(light));
        remoteControl.setCommands(1,new CeilingFanOnCommand(ceilingFan),
                new CeilingFanOffCommand(ceilingFan));
        remoteControl.setCommands(2,new StereoOnCommand(stereo),new StereoOffCommand(stereo));

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
    }
}
