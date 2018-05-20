package dp.command;

import dp.command.Receiver.MenuBar;
import dp.command.Receiver.SubMenu;

public interface Command {
    /**
     * 这个方法是一个返回结果为空的方法
     * 实际项目中，可以根据需求设计多个不同的方法
     */
    void execute();
}

class RefreshMenuBarCommand implements Command {
    private MenuBar menuBar;// 真正的命令执行者

    public RefreshMenuBarCommand(MenuBar menuBar) {
        this.menuBar = menuBar;
    }

    @Override
    public void execute() {
        // 命令真正执行前或后，执行相关处理
        System.out.println("RefreshMenuBarCommand action前做点东西");
        menuBar.refresh();
        System.out.println("RefreshMenuBarCommand action后做点东西");
        System.out.println("***********");
    }
}

class AddSubMenuCommand implements Command {
    private SubMenu subMenu;// 真正的命令执行者

    public AddSubMenuCommand(SubMenu subMenu) {
        this.subMenu = subMenu;
    }

    @Override
    public void execute() {
        subMenu.add();
    }
}

class DelSubMenuCommand implements Command {
    private SubMenu subMenu;// 真正的命令执行者

    public DelSubMenuCommand(SubMenu subMenu) {
        this.subMenu = subMenu;
    }

    @Override
    public void execute() {
        subMenu.del();
    }
}