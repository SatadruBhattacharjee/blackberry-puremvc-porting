package org.puremvc.java.patterns.command;

import java.util.Enumeration;
import java.util.Vector;
import org.puremvc.java.interfaces.ICommand;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.observer.Notifier;

public class MacroCommand extends Notifier
  implements ICommand
{
  private Vector subCommands = null;

  public MacroCommand()
  {
	 this.subCommands = new Vector();
    initializeMacroCommand();
  }

  protected void initializeMacroCommand()
  {
  }

  protected void addSubCommand(Class paramClass)
  {
    this.subCommands.addElement(paramClass);
  }

  public void execute(INotification paramINotification)
  {
    Class localClass = null;
    Enumeration localEnumeration = this.subCommands.elements();
    while (localEnumeration.hasMoreElements())
    {
      localClass = (Class)localEnumeration.nextElement();
      try
      {
        ICommand localICommand = (ICommand)localClass.newInstance();
        localICommand.execute(paramINotification);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
      }
      catch (InstantiationException localInstantiationException)
      {
      }
    }
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.patterns.command.MacroCommand
 * JD-Core Version:    0.6.0
 */