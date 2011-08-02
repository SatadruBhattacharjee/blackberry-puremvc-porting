package org.puremvc.java.interfaces;

public abstract interface IController
{
  public abstract void registerCommand(String paramString, Class paramClass);

  public abstract void executeCommand(INotification paramINotification);

  public abstract void removeCommand(String paramString);
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.interfaces.IController
 * JD-Core Version:    0.6.0
 */