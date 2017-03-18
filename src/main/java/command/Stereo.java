package command;

/**
 * Created by xpollcon on 17/03/2017.
 */
public class Stereo {
    private int volume;
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Stereo is On!");
    }

    public void setCD() {
        System.out.println("Stereo set to CD!");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo Volume set to:" + volume);
    }

    public void off(){
        System.out.println("Stereo is Off!");
    }
}
