package org.puremvc.java.core.view;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.puremvc.java.interfaces.IFunction;
import org.puremvc.java.interfaces.IMediator;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.interfaces.IObserver;
import org.puremvc.java.interfaces.IView;
import org.puremvc.java.patterns.observer.Observer;
import org.puremvc.java.patterns.observer.Observers;

public class View
  implements IView
{
  private static View instance;
  private Hashtable mediatorMap;
  private Hashtable observerMap;

  protected View()
  {
    instance = this;
    this.mediatorMap = new Hashtable();
    this.observerMap = new Hashtable();
    initializeView();
  }

  protected void initializeView()
  {
  }

  public static synchronized View getInstance()
  {
    if (instance == null)
      instance = new View();
    return instance;
  }

  public void notifyObservers(INotification paramINotification)
  {
    Observers localObservers = (Observers)this.observerMap.get(paramINotification.getName());
    if (localObservers != null)
      localObservers.notifyObservers(paramINotification);
  }

  public void registerMediator(final IMediator mediator)
  {
	  System.out.println("2222222222222222222222222222222222: " );
	  if( this.mediatorMap.containsKey(mediator.getMediatorName()) )
			return;

	   
		// Register the Mediator for retrieval by name
		this.mediatorMap.put(mediator.getMediatorName(), mediator);

		// Get Notification interests, if any.
		String[] noteInterests = mediator.listNotificationInterests();
		System.out.println("333333333333333333333333333333333: " );
		if (noteInterests.length != 0)
		{
			
			// Create java style function ref to mediator.handleNotification
			IFunction function = new IFunction()
			{
				
				public void onNotification(INotification notification)
				{
					
					mediator.handleNotification(notification);
				}
			};

			// Create Observer
			Observer observer = new Observer(function, mediator);

			// Register Mediator as Observer for its list of Notification
			// interests
			for (int i = 0; i < noteInterests.length; i++)
				registerObserver(noteInterests[i], observer);
		}

		// alert the mediator that it has been registered
		//mediator.onRegister();
  }

  public void registerObserver(String paramString, IObserver paramIObserver)
  {
    if (this.observerMap.get(paramString) != null)
    {
      Observers localObservers = (Observers)this.observerMap.get(paramString);
      localObservers.addObserver(paramIObserver);
    }
    else
    {
      this.observerMap.put(paramString, new Observers(paramString, paramIObserver));
    }
  }

  public IMediator removeMediator(String paramString)
  {
    Observers localObservers = null;
    IObserver localIObserver = null;
    Enumeration localEnumeration1 = this.observerMap.elements();
    while (localEnumeration1.hasMoreElements())
    {
      localObservers = (Observers)localEnumeration1.nextElement();
      Enumeration localEnumeration2 = localObservers.getObservers().elements();
      while (localEnumeration2.hasMoreElements())
      {
        localIObserver = (IObserver)localEnumeration2.nextElement();
        if (localIObserver.compareNotifyContext(retrieveMediator(paramString)))
          localObservers.deleteObserver(localIObserver);
        if (localObservers.getObservers().size() >= 1)
          continue;
        this.observerMap.remove(localObservers.getNotification());
      }
    }
    return (IMediator)this.mediatorMap.remove(paramString);
  }

  public IMediator retrieveMediator(String paramString)
  {
    return (IMediator)this.mediatorMap.get(paramString);
  }
}

/* Location:           G:\Help Codes\J2ME\Demo_Java_J2ME_Login\Demo_Java_J2ME_Login\lib\puremvc_java_0_2.jar
 * Qualified Name:     org.puremvc.java.core.view.View
 * JD-Core Version:    0.6.0
 */