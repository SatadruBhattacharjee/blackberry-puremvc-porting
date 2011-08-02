package org.puremvc.java.patterns.observer;

import org.puremvc.java.patterns.facade.Facade;

public class Notifier
{
  protected Facade facade = Facade.getInstance();

  public void sendNotification(String paramString1, Object paramObject, String paramString2)
  {
    this.facade.sendNotification(paramString1, paramObject, paramString2);
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.patterns.observer.Notifier
 * JD-Core Version:    0.6.0
 */