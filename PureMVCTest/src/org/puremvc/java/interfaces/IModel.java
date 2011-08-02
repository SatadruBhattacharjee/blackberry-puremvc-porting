package org.puremvc.java.interfaces;

public abstract interface IModel
{
  public abstract void registerProxy(IProxy paramIProxy);

  public abstract IProxy retrieveProxy(String paramString);

  public abstract IProxy removeProxy(String paramString);
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.interfaces.IModel
 * JD-Core Version:    0.6.0
 */