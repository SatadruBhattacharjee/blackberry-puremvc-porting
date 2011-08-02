package com.satatwork.puremvc.controller;

import org.puremvc.java.interfaces.ICommand;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.command.SimpleCommand;

import com.satatwork.puremvc.model.CalculationResult;

public class PrepModelCommand extends SimpleCommand implements ICommand {
	
	public void execute(INotification paramINotification) {
		//super.execute(paramINotification);
		this.facade.registerProxy(new CalculationResult());
	}

}
