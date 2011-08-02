package org.puremvc.java.patterns.command;

import org.puremvc.java.interfaces.ICommand;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.observer.Notifier;

public class SimpleCommand extends Notifier
  implements ICommand
{
  public void execute(INotification paramINotification)
  {
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.patterns.command.SimpleCommand
 * JD-Core Version:    0.6.0
 */