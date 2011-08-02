package org.puremvc.java.interfaces;

public abstract interface INotification
{
  public abstract String getName();

  public abstract void setBody(Object paramObject);

  public abstract Object getBody();

  public abstract void setType(String paramString);

  public abstract String getType();

  public abstract String toString();
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.interfaces.INotification
 * JD-Core Version:    0.6.0
 */