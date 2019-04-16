package com.bran.e_result;

import com.opensymphony.xwork2.ActionSupport;

public class DispatcherAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		System.out.println("DispatcherAction");
		return SUCCESS;
	}
}
