package com.bran.h_showvs;

import com.opensymphony.xwork2.ActionSupport;

public class ShowvsAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("ShowvsAction");
		return SUCCESS;
	}
	
}
