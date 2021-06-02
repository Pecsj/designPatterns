package structuralpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author csj
 * @Description: 编排命令
 * @Date 2021/6/2
 */
public class Broker {
    private List<CommandUsb> commands = new ArrayList<>();

    public void addCommand(CommandUsb command){
        commands.add(command);
    }

    public void executeCommands(){
        for (CommandUsb command : commands) {
            command.execute();
        }
    }

}
