package com.vee.controller;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.vee.model.User;

public class LoginAction extends ActionSupport{

	private User user;
	private List<String> errorList = new ArrayList<String>();
	
	public String doLogin(){
		if("admin".equalsIgnoreCase(user.getUsername()) && "admin".equalsIgnoreCase(user.getPassword())){
			return SUCCESS;
		}else{
			errorList.add("Login Failed !!!");
			setActionErrors(errorList);
			return INPUT;
		}
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
