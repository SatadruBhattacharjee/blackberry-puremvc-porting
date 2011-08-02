package org.puremvc.java.patterns.mediator;

import org.puremvc.java.interfaces.IMediator;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.observer.Notifier;

public class Mediator extends Notifier
  implements IMediator
{
  public static final String NAME = "Mediator";
  protected String mediatorName = null;
  protected Object viewComponent = null;

  public Mediator(String paramString, Object paramObject)
  {
    this.mediatorName = (paramString != null ? paramString : "Mediator");
    this.viewComponent = paramObject;
  }

  public final String getMediatorName()
  {
    return this.mediatorName;
  }

  public void setViewComponent(Object paramObject)
  {
    this.viewComponent = paramObject;
  }

  public Object getViewComponent()
  {
    return this.viewComponent;
  }

  public void handleNotification(INotification paramINotification)
  {
  }

  public String[] listNotificationInterests()
  {
    return null;
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.patterns.mediator.Mediator
 * JD-Core Version:    0.6.0
 */