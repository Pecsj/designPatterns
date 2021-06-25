package structuralpattern.command;

public class Zmain {
    /**
     * 命令模式
     * 命令模式(Command Pattern)：将一个请求封装为一个对象，从而使我们可用不同的请求对客户进行参数化；
     * 对请求排队或者记录请求日志，以及支持可撤销的操作。命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务(Transaction)模式。
     *
     *  优点：
     *  降低系统的耦合度。
     *  新的命令可以很容易地加入到系统中。
     *  可以比较容易地设计一个命令队列和宏命令（组合命令）。
     *  可以方便地实现对请求的Undo和Redo。
     *
     *  缺点：
     *  使用命令模式可能会导致某些系统有过多的具体命令类。因为针对每一个命令都需要设计一个具体命令类，因此某些系统可能需要大量具体命令类，这将影响命令模式的使用。
     *
     *  适用场景：
     *  系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。
     *  系统需要在不同的时间指定请求、将请求排队和执行请求。
     *  系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。
     *  系统需要将一组操作组合在一起，即支持宏命令
     *
     */
    public static void main(String[] args) {
        //被执行者
        Robot robot = new Robot();
        //命令对象
        CommandUsb command1 = new UpTwoCommand(robot);
        CommandUsb command2 = new DownOneCommand(robot);
        //命令执行者
        Broker broker = new Broker();
        //写入命令计划
        broker.addCommand(command1);
        broker.addCommand(command2);
        broker.executeCommands();
    }

}
