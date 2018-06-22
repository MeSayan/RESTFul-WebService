package com.sayan.dao;

import org.springframework.stereotype.Service;

@Service
public class DemoClass {

	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
