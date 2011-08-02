package com.satatwork.puremvc;

import com.satatwork.puremvc.view.AddScreenMediator;

import net.rim.device.api.ui.MenuItem;
import net.rim.device.api.ui.component.EditField;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.container.MainScreen;

/**
 * A class extending the MainScreen class, which provides default standard
 * behavior for BlackBerry GUI applications.
 */
public final class PureMVC extends MainScreen
{
	EditField editFieldValue1;
	EditField editFieldValue2;
	LabelField labelFieldResult;
	AddScreenMediator mediator;
	
    /**
     * Creates a new PureMVC object
     */
    public PureMVC(AddScreenMediator mediator)
    {     
    	this.mediator	= mediator;
        // Set the displayed title of the screen       
        setTitle("Pure MVC Test");
        
        editFieldValue1		= new EditField();
        editFieldValue2		= new EditField();
        labelFieldResult	= new LabelField();
        add(editFieldValue1);
        add(editFieldValue2);
        add(labelFieldResult);
        addMenuItem(_addItem);
    }
    
    public void setResult(String result){
    	labelFieldResult.setText(result);
    }
    
    private MenuItem _addItem = new MenuItem("Add", 110, 10)
    {
       public void run() 
       {
    	   mediator.ADD(Integer.valueOf(editFieldValue1.getText().trim()), Integer.valueOf(editFieldValue2.getText().trim()));
       }
    };
}
