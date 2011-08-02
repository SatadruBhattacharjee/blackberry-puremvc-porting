package com.satatwork.puremvc;


import net.rim.device.api.ui.UiApplication;


import org.puremvc.java.patterns.facade.Facade;
import org.puremvc.java.patterns.observer.Notification;

import com.satatwork.puremvc.controller.CalculateCommand;
import com.satatwork.puremvc.controller.StartupCommand;
import com.satatwork.puremvc.model.CalculationResult;

public class ApplicationFacade extends Facade{
	
	private static ApplicationFacade instance = null;
	
	public static final String STARTUP = "startup";
	
	public static final String ADD = "add";
	
	public static final String ADD_COMPLETE = "add complete";
	
	public static UiApplication uiApplication;
	
	public static ApplicationFacade getInst()
	{

		if(instance == null)
		{
			instance = new ApplicationFacade();
		}

		return instance;
	}
	
	public void startup(UiApplication uiapplication)
	{
		uiApplication = uiapplication;		
		notifyObservers(new Notification(STARTUP, null, null));
	}
	
	protected void initializeController() {		
		super.initializeController();
		registerCommand(STARTUP, StartupCommand.class);
		registerCommand(ADD, CalculateCommand.class);
	}

}
