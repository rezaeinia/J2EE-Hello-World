package com.arnia.biz.bean;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.arnia.biz.SingletonRemote;

@Singleton(mappedName = "SINGLETON-SESSION-BEAN")
public class SingletonSessionBean implements SingletonRemote {

	@PersistenceContext(unitName = "ATS-EJB")
	EntityManager entityManager;

	@PostConstruct
	private void init() {
		timerService.createTimer(5000, "Created new programmatic timer");
	}

	String userName = "defaultUserName";

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
	
    @Resource
    TimerService timerService;

    @Timeout
    public void programmaticTimeout(Timer timer) {
       System.out.println("programmatic timer");
    }
    
	@Schedule(hour ="*" , minute ="*" ,second="*/5" ) 
	public void automaticTimer() {
		System.out.println("automatic timer");
	}
	

}
