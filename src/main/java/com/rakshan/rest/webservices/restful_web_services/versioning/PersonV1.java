package com.rakshan.rest.webservices.restful_web_services.versioning;

public class PersonV1 {
	
	
	private String name;

	public String getName() {
		return name;
	}

	public PersonV1(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonV1 [name=" + name + "]";
	}
	
}
