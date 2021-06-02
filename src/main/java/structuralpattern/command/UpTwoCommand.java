package structuralpattern.command;

public class UpTwoCommand implements CommandUsb{
    private Robot robot;

    UpTwoCommand(Robot robot){
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.up(2);
    }
}
