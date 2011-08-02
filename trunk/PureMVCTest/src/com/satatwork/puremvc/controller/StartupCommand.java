package com.satatwork.puremvc.controller;

import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.command.MacroCommand;

public class StartupCommand extends MacroCommand{
	
	
	
	protected void initializeMacroCommand()
	{
		addSubCommand(PrepViewCommands.class);
		addSubCommand(PrepModelCommand.class);	
	}

}
