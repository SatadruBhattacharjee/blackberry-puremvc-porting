package org.puremvc.java.patterns.proxy;

import org.puremvc.java.interfaces.IProxy;
import org.puremvc.java.patterns.observer.Notifier;

public class Proxy extends Notifier
  implements IProxy
{
  private String proxyName = "Proxy";
  private Object data = null;

  public Proxy(String paramString, Object paramObject)
  {
    if (paramString != null)
      this.proxyName = paramString;
    if (paramObject != null)
      this.data = paramObject;
  }

  public String getProxyName()
  {
    return this.proxyName;
  }

  public void setData(Object paramObject)
  {
    this.data = paramObject;
  }

  public Object getData()
  {
    return this.data;
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.patterns.proxy.Proxy
 * JD-Core Version:    0.6.0
 */