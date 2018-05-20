package dp.command;

import dp.command.Receiver.MenuBar;
import dp.command.Receiver.SubMenu;

public class Client {
    public static void main(String[] args) {
        SubMenu subMenu = new SubMenu();
        MenuBar menuBar = new MenuBar();
        Command refreshMenuBarCommand = new RefreshMenuBarCommand(menuBar);
        Command addSubMenuCommand = new AddSubMenuCommand(subMenu);
        Command delSubMenuCommand = new DelSubMenuCommand(subMenu);

        Invoke i = new Invoke();
        i.addCommand(refreshMenuBarCommand);
        i.addCommand(addSubMenuCommand);
        i.addCommand(delSubMenuCommand);

        i.call();
    }
}
