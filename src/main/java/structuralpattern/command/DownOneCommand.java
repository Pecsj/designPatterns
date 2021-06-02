package structuralpattern.command;

public class DownOneCommand implements CommandUsb{
    private Robot robot;

    DownOneCommand(Robot robot){
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.down(1);
    }
}
