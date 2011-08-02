package com.satatwork.puremvc;

import net.rim.device.api.ui.UiApplication;

/**
 * This class extends the UiApplication class, providing a
 * graphical user interface.
 */
public class PureMVCTest extends UiApplication
{
	
	ApplicationFacade facade = ApplicationFacade.getInst();
    /**
     * Entry point for application
     * @param args Command line arguments (not used)
     */ 
    public static void main(String[] args)
    {   	
    	
	    System.out.println("==========================================");
	    PureMVCTest theApp = new PureMVCTest();       
	    theApp.enterEventDispatcher();
	    theApp.startApp();
    	
    	
    }
    

    /**
     * Creates a new PureMVCTest object
     */
    public PureMVCTest()
    {    	
    	
        //Push a screen onto the UI stack for rendering.
        //pushScreen(new PureMVC(null));
    	facade.startup(this);
    } 
    
    public void startApp(){
    	
    }
    
    
}
