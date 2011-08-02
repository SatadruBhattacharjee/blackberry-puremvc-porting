package com.satatwork.puremvc.controller;


import org.puremvc.java.interfaces.ICommand;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.command.SimpleCommand;
import org.puremvc.java.patterns.observer.Notification;

import com.satatwork.puremvc.ApplicationFacade;
import com.satatwork.puremvc.model.CalculationResult;

public class CalculateCommand extends SimpleCommand implements ICommand {
	
	public void execute(INotification notification) {		
		super.execute(notification);
		Integer[] params = (Integer[])notification.getBody();
		
		int sum = params[0].intValue() + params[1].intValue();
		CalculationResult resultProxy = (CalculationResult)facade.retrieveProxy(CalculationResult.NAME);
		
		resultProxy.setResult(String.valueOf(sum));
		
		this.facade.notifyObservers(new Notification(ApplicationFacade.ADD_COMPLETE, null, null));
		
	}

}
