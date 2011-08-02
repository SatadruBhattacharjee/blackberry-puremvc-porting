package org.puremvc.java.patterns.facade;

import org.puremvc.java.core.controller.Controller;
import org.puremvc.java.core.model.Model;
import org.puremvc.java.core.view.View;
import org.puremvc.java.interfaces.IFacade;
import org.puremvc.java.interfaces.IMediator;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.interfaces.IProxy;
import org.puremvc.java.patterns.observer.Notification;

public class Facade
  implements IFacade
{
  protected static Facade instance = null;
  protected Controller controller = null;
  protected Model model = null;
  protected View view = null;

  protected Facade()
  {
    if (instance != null)
      throw new RuntimeException("Facade already constructed");
    initializeFacade();
  }

  protected void initializeFacade()
  {
    initializeModel();
    initializeController();
    initializeView();
  }

  public static synchronized Facade getInstance()
  {
    if (instance == null)
      try
      {
        instance = new Facade();
      }
      catch (Exception localException)
      {
      }
    return instance;
  }

  protected void initializeController()
  {
    if (this.controller != null)
      return;
    this.controller = Controller.getInstance();
  }

  protected void initializeModel()
  {
    if (this.model != null)
      return;
    this.model = Model.getInstance();
  }

  protected void initializeView()
  {
    if (this.view != null)
      return;
    this.view = View.getInstance();
  }

  public void registerCommand(String paramString, Class paramClass)
  {
    this.controller.registerCommand(paramString, paramClass);
  }

  public void removeCommand(String paramString)
  {
    this.controller.removeCommand(paramString);
  }

  public void registerMediator(IMediator paramIMediator)
  {
    if (this.view != null)
      this.view.registerMediator(paramIMediator);
  }

  public void registerProxy(IProxy paramIProxy)
  {
    this.model.registerProxy(paramIProxy);
  }

  public IMediator removeMediator(String paramString)
  {
    if (this.view != null)
      return this.view.removeMediator(paramString);
    return null;
  }

  public IProxy removeProxy(String paramString)
  {
    if (this.model != null)
      return this.model.removeProxy(paramString);
    return null;
  }

  public IMediator retrieveMediator(String paramString)
  {
    return this.view.retrieveMediator(paramString);
  }

  public IProxy retrieveProxy(String paramString)
  {
    return this.model.retrieveProxy(paramString);
  }

  public void sendNotification(String paramString1, Object paramObject, String paramString2)
  {
    notifyObservers(new Notification(paramString1, paramObject, paramString2));
  }

  public void notifyObservers(INotification paramINotification)
  {
	  
    if (this.view != null){
      System.out.println("??????????????????????????????????????????????");	
      this.view.notifyObservers(paramINotification);
    }
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.patterns.facade.Facade
 * JD-Core Version:    0.6.0
 */