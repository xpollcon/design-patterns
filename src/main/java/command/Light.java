package command;

/**
 * Created by xpollcon on 16/03/2017.
 */
public class Light {

    String location ="";

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " " + "Light is On!");
    }

    public void off() {
        System.out.println(location + " " + "Light is Off!");
    }
}
