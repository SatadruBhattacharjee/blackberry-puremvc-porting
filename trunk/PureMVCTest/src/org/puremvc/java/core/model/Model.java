package org.puremvc.java.core.model;

import java.util.Hashtable;
import org.puremvc.java.interfaces.IModel;
import org.puremvc.java.interfaces.IProxy;

public class Model
  implements IModel
{
  protected static Model instance;
  protected Hashtable proxyMap;

  protected Model()
  {
    instance = this;
    this.proxyMap = new Hashtable();
    initializeModel();
  }

  protected void initializeModel()
  {
  }

  public static synchronized Model getInstance()
  {
    if (instance == null)
      instance = new Model();
    return instance;
  }

  public void registerProxy(IProxy paramIProxy)
  {
    this.proxyMap.put(paramIProxy.getProxyName(), paramIProxy);
  }

  public IProxy removeProxy(String paramString)
  {
    return (IProxy)this.proxyMap.remove(paramString);
  }

  public IProxy retrieveProxy(String paramString)
  {
    return (IProxy)this.proxyMap.get(paramString);
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.core.model.Model
 * JD-Core Version:    0.6.0
 */