package command;

/**
 * Created by xpollcon on 17/03/2017.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println("Ceiling fan set to HIGH");
    }


    public void medium(){
        speed = MEDIUM;
        System.out.println("Ceiling fan set to MEDIUM");
    }


    public void low(){
        speed = LOW;
        System.out.println("Ceiling fan set to LOW");
    }

    public void off(){
        speed = OFF;
        System.out.println("Ceiling fan set to OFF");
    }

    public int getSpeed(){
        return speed;
    }

}
