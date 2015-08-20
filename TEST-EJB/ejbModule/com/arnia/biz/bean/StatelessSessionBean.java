package com.arnia.biz.bean;

import javax.ejb.Stateless;

import com.arnia.biz.StatelessRemote;

@Stateless(mappedName = "STATELESS-SESSION-BEAN")
public class StatelessSessionBean implements StatelessRemote {

	String userName;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
}
