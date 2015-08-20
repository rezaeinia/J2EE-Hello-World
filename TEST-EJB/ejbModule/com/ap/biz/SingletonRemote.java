package com.ap.biz;

import javax.ejb.Remote;

@Remote
public interface SingletonRemote {

	public void setUserName(String userName);

	public String getUserName();
}
