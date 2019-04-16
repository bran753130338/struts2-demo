package com.bran.e_result;

import com.opensymphony.xwork2.ActionSupport;

public class ChainAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		System.out.println("ChainAction");
		return SUCCESS;
	}
}
