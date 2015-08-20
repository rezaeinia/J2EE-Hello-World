package com.arnia.biz.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

import com.arnia.biz.StatefullRemote;

@Stateful(mappedName = "STATEFULL-SESSION-BEAN")
public class StatefullSessionBean implements StatefullRemote {
	String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
