package com.bran.g_paramter;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

//struts2封装集合类型参数
public class ParamterListAction extends ActionSupport {
	// list
	private List<String> list;

	// map
	private Map<String, String> map;

	@Override
	public String execute() throws Exception {

		System.out.println("list:" + list);
		System.out.println("map:" + map);
		return SUCCESS;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

}
