package com.bran.g_paramter;

import com.bran.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

//struts2如何获得参数
public class Paramter3Action extends ActionSupport implements ModelDriven<User>{
	//准备User 成员变量
	private User user = new User();

	@Override
	public String execute() throws Exception {
		if(user!=null)
			System.out.println("用户："+user.toString());

		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}


	

}
