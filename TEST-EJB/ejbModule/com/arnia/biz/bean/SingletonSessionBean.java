package com.arnia.biz.bean;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.arnia.biz.SingletonRemote;

@Singleton(mappedName = "SINGLETON-SESSION-BEAN")
public class SingletonSessionBean implements SingletonRemote {

	@PersistenceContext(unitName = "ATS-EJB")
	EntityManager entityManager;

	@PostConstruct
	private void init() {

	}

	String userName = "defaultUserName";

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

}
