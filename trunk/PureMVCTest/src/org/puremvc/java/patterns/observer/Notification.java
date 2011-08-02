package org.puremvc.java.patterns.observer;

import org.puremvc.java.interfaces.INotification;

public class Notification
  implements INotification
{
  private String name = null;
  private String type = null;
  private Object body = null;

  public Notification(String paramString1, Object paramObject, String paramString2)
  {
    this.name = paramString1;
    this.body = paramObject;
    this.type = paramString2;
  }

  public Object getBody()
  {
    return this.body;
  }

  public String getName()
  {
    return this.name;
  }

  public String getType()
  {
    return this.type;
  }

  public void setBody(Object paramObject)
  {
    this.body = paramObject;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }

  public String toString()
  {
    String str = "Notification Name: " + getName() + " Body: ";
    if (this.body != null)
      str = str + this.body.toString() + " type: ";
    else
      str = str + "null type: ";
    if (this.type != null)
      str = str + str;
    else
      str = str + "null ";
    return str;
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.patterns.observer.Notification
 * JD-Core Version:    0.6.0
 */