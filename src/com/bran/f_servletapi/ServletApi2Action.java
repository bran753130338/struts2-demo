package com.bran.f_servletapi;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

//在action中获得原生ServletAPI
public class ServletApi2Action extends ActionSupport {
	//并不推荐
	@Override
	public String execute() throws Exception {	
		//原生request
		HttpServletRequest request = ServletActionContext.getRequest();
		//原生session
		HttpSession session = request.getSession();
		//原生response
		HttpServletResponse response = ServletActionContext.getResponse();
		//原生servletContext
		ServletContext servletContext = ServletActionContext.getServletContext();
		return SUCCESS;
	}
}
