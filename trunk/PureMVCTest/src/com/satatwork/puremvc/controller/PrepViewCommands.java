package com.satatwork.puremvc.controller;

import org.puremvc.java.interfaces.ICommand;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.command.SimpleCommand;

import com.satatwork.puremvc.view.AddScreenMediator;

public class PrepViewCommands extends SimpleCommand implements ICommand {
	
	public void execute(INotification paramINotification) {
		//super.execute(paramINotification);
		System.out.println("3333333333333333333333333333333333: " );
		this.facade.registerMediator(new AddScreenMediator());
	}

}
