package com.arnia.web.jsf.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.arnia.data.Greeting;

@Named
@RequestScoped
public class Printer {
	@Inject
	Greeting greeting;
	private String name;
	private String salutation;

	public void createSalutation() {
		this.salutation = greeting.greet(name);
	}

	public String getSalutation() {
		return salutation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
