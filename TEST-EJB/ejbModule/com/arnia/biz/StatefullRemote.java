package com.arnia.biz;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface StatefullRemote {
	public String getUserName() ;
	public void setUserName(String userName) ;
}
