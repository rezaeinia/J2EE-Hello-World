package com.arnia.web.service.rest;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.ap.biz.SingletonRemote;
import com.ap.biz.StatefullRemote;
import com.ap.biz.StatelessRemote;

public class Accessor {
	// private static ChargeRequestRemote chargeRequestBean;
	private static InitialContext context;

	public static StatelessRemote getStatelessBean() {
		// if (chargeRequestBean != null)
		// return chargeRequestBean;
		try {

			StatelessRemote statelessRemote;
			 statelessRemote= (StatelessRemote) getContext().lookup(
					"STATELESS-SESSION-BEAN#com.ap.biz.StatelessRemote");
			return statelessRemote;

		} catch (NamingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);

		}

	}
	public static StatefullRemote getStateFullBean() {
		try {

			StatefullRemote stateFullRemote;
			stateFullRemote = (StatefullRemote) getContext().lookup(
					"STATEFULL-SESSION-BEAN#com.ap.biz.StateFullRemote");
			return stateFullRemote;

		} catch (NamingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);

		}
	}
	public static SingletonRemote getSingletonBean() {
		try {

			SingletonRemote serviceBean;
			serviceBean = (SingletonRemote) getContext().lookup(
					"SINGLETON-SESSION-BEAN#com.ap.biz.SingletonRemote");
			return serviceBean;

		} catch (NamingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);

		}
	}

	private static InitialContext getContext() {

		if (context != null)
			return context;
		try {

			context = new InitialContext();
			return context;
		} catch (NamingException e) {

			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	
}
