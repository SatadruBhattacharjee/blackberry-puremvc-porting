package org.puremvc.java.core.controller;

import java.util.Hashtable;
import org.puremvc.java.core.view.View;
import org.puremvc.java.interfaces.ICommand;
import org.puremvc.java.interfaces.IController;
import org.puremvc.java.interfaces.IFunction;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.observer.Observer;

public class Controller
  implements IController
{
  protected static Controller instance;
  protected Hashtable commandMap;
  protected View view;

  protected Controller()
  {
    instance = this;
    this.commandMap = new Hashtable();
    initializeController();
  }

  protected void initializeController()
  {
    this.view = View.getInstance();
  }

  public static synchronized Controller getInstance()
  {
    if (instance == null)
      instance = new Controller();
    return instance;
  }

  public void executeCommand(INotification paramINotification)
  {
    Class localClass = (Class)this.commandMap.get(paramINotification.getName());
    if (localClass == null)
      return;
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

  public void registerCommand(String paramString, Class paramClass)
  {
    if (null != this.commandMap.put(paramString, paramClass))
      return;
    this.view.registerObserver(paramString, new Observer(new IFunction()
    {
      public void onNotification(INotification paramINotification)
      {
        Controller.this.executeCommand(paramINotification);
      }
    }
    , this));
  }

  public void removeCommand(String paramString)
  {
    this.commandMap.remove(paramString);
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.core.controller.Controller
 * JD-Core Version:    0.6.0
 */