package com.bran.d_action;

import com.opensymphony.xwork2.Action;
/*
      方式2：实现一个接口Action
      里面有execute方法，提供action方法的规范
   Action接口预置了一些字符串   
 * 
 */

public class Demo4Action implements Action{

	@Override
	public String execute() throws Exception {
		return null;
	}

}
