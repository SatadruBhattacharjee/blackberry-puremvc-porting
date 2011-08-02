package org.puremvc.java.patterns.observer;

import java.util.Enumeration;
import java.util.Vector;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.interfaces.IObserver;

public class Observers
{
  private Vector observers;
  private String notificationName;

  public Observers(String paramString, IObserver paramIObserver)
  {
    if ((paramString != null) && (paramIObserver != null))
    {
      this.observers = new Vector();
      this.observers.addElement(paramIObserver);
      this.notificationName = paramString;
    }
    else
    {
      throw new NullPointerException();
    }
  }

  public Vector getObservers()
  {
    return this.observers;
  }

  public void addObserver(IObserver paramIObserver)
  {
    if (paramIObserver != null)
      this.observers.addElement(paramIObserver);
    else
      throw new NullPointerException();
  }

  public void deleteObserver(IObserver paramIObserver)
  {
    if (paramIObserver != null)
      this.observers.removeElement(paramIObserver);
    else
      throw new NullPointerException();
  }

  public void notifyObservers(INotification paramINotification)
  {
    if (paramINotification != null)
    {
      IObserver localIObserver = null;
      Enumeration localEnumeration = this.observers.elements();
      while (localEnumeration.hasMoreElements())
      {
        localIObserver = (IObserver)localEnumeration.nextElement();
        localIObserver.notifyObserver(paramINotification);
      }
    }
    else
    {
      throw new NullPointerException();
    }
  }

  public String getNotification()
  {
    return this.notificationName;
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.patterns.observer.Observers
 * JD-Core Version:    0.6.0
 */