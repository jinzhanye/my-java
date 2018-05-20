package dp.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令的调用者/发起者
 */
public class Invoke {
    // 可以通过容器List<Command>容纳很多个命令对象，进行批处理。也可以是单个Command对象
    private List<Command> commandList;

    public Invoke() {
        this.commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commandList.add(command);
    }

    // 业务方法，用于调用命令的方法
    public void call() {
        commandList.forEach(c -> c.execute());
    }
}
