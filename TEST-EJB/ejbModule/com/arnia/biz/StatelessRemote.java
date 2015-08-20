package com.arnia.biz;

import javax.ejb.Remote;

@Remote
public interface StatelessRemote {
	public String getUserName();

	public void setUserName(String userName);
}
