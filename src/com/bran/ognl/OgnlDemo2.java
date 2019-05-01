package com.bran.ognl;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bran.domain.User;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

//显示OGNL语法
public class OgnlDemo2 {
	@Test
	// 基本语法测试
	//ognl创建对象-  list | map
	public void fun1() {
		// 准备OGNLContext
		// 准备Root
		User rootUser = new User("张帅", 18);
		// 准备Context
		Map<String, User> context = new HashMap<>();
		context.put("user", new User("雷神", 19));
		context.put("user1", new User("蚁人", 16));
		context.put("user2", new User("钢铁侠", 17));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		// 书写OGNL
		// 创建list对象
		String ex = "{'java','c++','python','go'}.size()";
		String ex1 = "{'java','c++','python','go'}[0]";
		String ex2 = "{'java','c++','python','go'}.get(1)";
		//创建map对象
		String ex3 = "#{'name':'tom','age':40}.size()";
		String ex4 = "#{'name':'tom','age':40}['name']";
		String ex5 = "#{'name':'tom','age':40}.get('age')";
		try {
			Integer size = (Integer) Ognl.getValue(ex, oc, oc.getRoot());
			String name = (String) Ognl.getValue(ex1, oc, oc.getRoot());
			String name1 = (String) Ognl.getValue(ex2, oc, oc.getRoot());
			System.out.println(size);
			System.out.println(name);
			System.out.println(name1);
			Integer size1 = (Integer) Ognl.getValue(ex3, oc, oc.getRoot());
			String name2 = (String) Ognl.getValue(ex4, oc, oc.getRoot());
			Integer age = (Integer) Ognl.getValue(ex5, oc, oc.getRoot());
			System.out.println(size1);
			System.out.println(name2);
			System.out.println(age);
		} catch (OgnlException e) {
			e.printStackTrace();
		} 
	}
}
