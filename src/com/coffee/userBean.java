package com.coffee;

import java.io.Serializable;

public class userBean implements Serializable {
	private String userName;
	private String password;

	public userBean() {
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
