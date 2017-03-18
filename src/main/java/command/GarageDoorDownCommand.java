package command;

/**
 * Created by xpollcon on 17/03/2017.
 */
public class GarageDoorDownCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {

    }
}
