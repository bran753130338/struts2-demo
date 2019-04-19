package com.bran.f_servletapi;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

//在action中获得原生ServletApi
public class ServletApiAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {	
		ActionContext context = ActionContext.getContext();
		//request域==>map(struts2并不推荐使用原生request域)
		//不推荐
		Map<String, Object> requestScope = (Map<String, Object>)context.get("request");
		//推荐
		context.put("name", "requestKris");
		//session域==>map
		Map<String, Object> sessionScope = context.getSession();
		sessionScope.put("name", "sessionKris");
		//application域==>map
		Map<String, Object> applicationScope = context.getApplication();
		applicationScope.put("name", "applicationKris");
		return SUCCESS;
	}
}
