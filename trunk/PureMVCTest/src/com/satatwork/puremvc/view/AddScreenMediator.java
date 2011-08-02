package com.satatwork.puremvc.view;


import net.rim.device.api.ui.container.MainScreen;


import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.mediator.Mediator;
import org.puremvc.java.patterns.observer.Notification;

import com.satatwork.puremvc.ApplicationFacade;
import com.satatwork.puremvc.PureMVC;
import com.satatwork.puremvc.model.CalculationResult;

public class AddScreenMediator extends Mediator {
	
	public static final String NAME = "AddScreenMediator";
	
	PureMVC pureMVC	= null;

	public AddScreenMediator() {
		super(NAME, null);
		pureMVC = new PureMVC(this);
	}
	
	private PureMVC getAddScreen(){
		return pureMVC;
	}
	
	public String[] listNotificationInterests() {
		// TODO Auto-generated method stub
		return new String[]{
			ApplicationFacade.STARTUP,ApplicationFacade.ADD_COMPLETE
		};
	}
	
	public void ADD(Integer value1, Integer value2)
	{
		Integer[] values = {value1,value2};
		this.facade.notifyObservers(new Notification(ApplicationFacade.ADD,values, null));
	}
	
	public void handleNotification(INotification note) {
		System.out.println("2222222222222222222222222222222222: " + note.getName());	
		if(note.getName().equals(ApplicationFacade.STARTUP))
		{			
			ApplicationFacade.uiApplication.pushScreen(getAddScreen());
		}
		else if(note.getName().equals(ApplicationFacade.ADD_COMPLETE)){
			CalculationResult resultProxy = (CalculationResult)facade.retrieveProxy(CalculationResult.NAME);
			System.out.println("Result is : " + resultProxy.getResult());
			getAddScreen().setResult(resultProxy.getResult());
		}
	}

}
