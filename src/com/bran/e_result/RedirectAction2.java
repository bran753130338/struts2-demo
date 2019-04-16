package com.bran.e_result;

import com.opensymphony.xwork2.ActionSupport;

public class RedirectAction2 extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		System.out.println("RedirectAction2");
		return SUCCESS;
	}
}
