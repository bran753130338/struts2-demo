package com.bran.g_paramter;

import com.bran.domain.User;
import com.opensymphony.xwork2.ActionSupport;

//struts2如何获得参数
public class Paramter2Action extends ActionSupport {
	//准备User对象
	private User user;

	@Override
	public String execute() throws Exception {
		if(user!=null)
			System.out.println("用户："+user.toString());

		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}
