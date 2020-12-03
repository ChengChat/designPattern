package command.receiver;

public class Stereo {
    public void on(){
        System.out.println("stereo is on");
    }

    public void off(){
        System.out.println("stereo is off");
    }

    public void setCD(){
        System.out.println("stereo is set for CD input");
    }

    public void setVolume(int volume){
        System.out.println("stereo volume set to " + volume);
    }
}
