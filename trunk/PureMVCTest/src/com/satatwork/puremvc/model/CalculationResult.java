package com.satatwork.puremvc.model;

import org.puremvc.java.patterns.proxy.Proxy;

public class CalculationResult extends Proxy {
	
	public static final String NAME = "CalculationResultProxy";
	
	private String result;

	public CalculationResult() {
		super(NAME, new String());
		// TODO Auto-generated constructor stub
	}
	
	public String getResult(){
		return result;
	}
	
	public void setResult(String result){
		this.result	= result;
	}

}
