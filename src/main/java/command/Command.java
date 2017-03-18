package command;

/**
 * Created by xpollcon on 16/03/2017.
 */
public interface Command {
    void execute();
    void undo();
}
