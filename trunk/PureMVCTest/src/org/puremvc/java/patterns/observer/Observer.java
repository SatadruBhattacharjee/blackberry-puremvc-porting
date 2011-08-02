package org.puremvc.java.patterns.observer;

import org.puremvc.java.interfaces.IFunction;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.interfaces.IObserver;

public class Observer
  implements IObserver
{
  private Object context;
  private IFunction notify;

  public Observer(IFunction paramIFunction, Object paramObject)
  {
    setNotifyContext(paramObject);
    setNotifyMethod(paramIFunction);
  }

  public boolean compareNotifyContext(Object paramObject)
  {
    return this.context == paramObject;
  }

  public void notifyObserver(INotification paramINotification)
  {
	System.out.println("1111111111111111111111111111111111111111111111: " + paramINotification.getName());  
    getNotifyMethod().onNotification(paramINotification);
  }

  public void setNotifyContext(Object paramObject)
  {
    this.context = paramObject;
  }

  public void setNotifyMethod(IFunction paramIFunction)
  {
    this.notify = paramIFunction;
  }

  public IFunction getNotifyMethod()
  {
    return this.notify;
  }

  public Object getNotifyContext()
  {
    return this.context;
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.patterns.observer.Observer
 * JD-Core Version:    0.6.0
 */