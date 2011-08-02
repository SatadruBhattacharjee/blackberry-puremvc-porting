package org.puremvc.java.interfaces;

public abstract interface IFacade extends INotifier
{
  public abstract void notifyObservers(INotification paramINotification);

  public abstract void registerProxy(IProxy paramIProxy);

  public abstract IProxy retrieveProxy(String paramString);

  public abstract IProxy removeProxy(String paramString);

  public abstract void registerCommand(String paramString, Class paramClass);

  public abstract void removeCommand(String paramString);

  public abstract void registerMediator(IMediator paramIMediator);

  public abstract IMediator retrieveMediator(String paramString);

  public abstract IMediator removeMediator(String paramString);
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.interfaces.IFacade
 * JD-Core Version:    0.6.0
 */