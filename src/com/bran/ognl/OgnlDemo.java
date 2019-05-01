package com.bran.ognl;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bran.domain.User;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

//显示OGNL语法
public class OgnlDemo {
	@Test
	// 基本语法测试
	// 取出root中的属性值
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
		// 取出root中的user对象的name属性或age属性
		String ex = "name";
		String ex1 = "age";
		try {
			String name = (String) Ognl.getValue(ex, oc, oc.getRoot());
			Integer age = (Integer) Ognl.getValue(ex1, oc, oc.getRoot());
			System.out.println(name + '\t' + age);
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}

	@Test
	// 基本语法测试
	// 取出context中的属性值
	public void fun2() {
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
		// 取出context中的user对象的name属性或age属性
		String ex = "#user.name";
		String ex1 = "#user.age";
		String ex2 = "#user1.name";
		String ex3 = "#user1.age";
		try {
			String name = (String) Ognl.getValue(ex, oc, oc.getRoot());
			Integer age = (Integer) Ognl.getValue(ex1, oc, oc.getRoot());
			String name1 = (String) Ognl.getValue(ex2, oc, oc.getRoot());
			Integer age1 = (Integer) Ognl.getValue(ex3, oc, oc.getRoot());
			System.out.println(name + '\t' + age);
			System.out.println(name1 + '\t' + age1);
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}

	@Test
	// 基本语法测试
	// 为属性赋值
	public void fun3() {
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
		// 为root中的属性赋值
		String ex = "name='阿雷'";
		// 先赋值，后取值
		String ex1 = "#user.name='洛基',#user.name";
		try {
			Ognl.getValue(ex, oc, oc.getRoot());
			String name = (String) Ognl.getValue("name", oc, oc.getRoot());
			String name1 = (String) Ognl.getValue(ex1, oc, oc.getRoot());
			System.out.println(name);
			System.out.println(name1);
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}

	@Test
	// 基本语法测试
	// 调用对象的方法
	public void fun4() {
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
		// 从root中调用对象的方法
		String ex = "setName('洛基'),getName()";
		String ex2 = "#user.setName('阿雷')";
		String ex3 = "#user.getName()";
		try {
			String name = (String) Ognl.getValue(ex, oc, oc.getRoot());
			Ognl.getValue(ex2, oc, oc.getRoot());
			String name1 = (String) Ognl.getValue(ex3, oc, oc.getRoot());
			System.out.println(name);
			System.out.println(name1);
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}

	@Test
	//基本语法测试
	//调用静态方法
	public void fun5() {
		//准备OGNLContext
			//准备Root
			User rootUser = new User("张帅",18);
			//准备Context
			Map<String,User> context = new HashMap<>();
			context.put("user", new User("雷神",19));
			context.put("user1", new User("蚁人",16));
			context.put("user2", new User("钢铁侠",17));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		//书写OGNL
		//从root中调用对象的方法
		String ex = "@com.bran.ognl.HahaUtils@echo('hello')";
		String ex1 = "@java.lang.Math@PI";//@@PI
		try {
			String value = (String) Ognl.getValue(ex, oc, oc.getRoot());
			Double pi = (Double) Ognl.getValue(ex1, oc, oc.getRoot());
			System.out.println(value);
			System.out.println(pi);
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}
}
