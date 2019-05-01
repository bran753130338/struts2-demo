package com.bran.g_paramter;

import com.opensymphony.xwork2.ActionSupport;

//struts2如何获得参数
public class ParamterAction extends ActionSupport {
	//准备与参数键名称相同的属性
	private String name;
	
	private String password;

	@Override
	public String execute() throws Exception {
		System.out.println("用户名："+name);
		System.out.println("密码："+password);
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
