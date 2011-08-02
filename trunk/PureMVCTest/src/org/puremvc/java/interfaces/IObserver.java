package org.puremvc.java.interfaces;

public abstract interface IObserver
{
  public abstract void setNotifyMethod(IFunction paramIFunction);

  public abstract void setNotifyContext(Object paramObject);

  public abstract void notifyObserver(INotification paramINotification);

  public abstract boolean compareNotifyContext(Object paramObject);
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.interfaces.IObserver
 * JD-Core Version:    0.6.0
 */