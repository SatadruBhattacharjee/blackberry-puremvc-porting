package org.puremvc.java.interfaces;

public abstract interface IMediator
{
  public abstract String getMediatorName();

  public abstract Object getViewComponent();

  public abstract void setViewComponent(Object paramObject);

  public abstract String[] listNotificationInterests();

  public abstract void handleNotification(INotification paramINotification);
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.interfaces.IMediator
 * JD-Core Version:    0.6.0
 */