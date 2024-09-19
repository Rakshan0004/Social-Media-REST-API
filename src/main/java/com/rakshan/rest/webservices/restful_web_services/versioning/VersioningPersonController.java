package com.rakshan.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Rohit Sharma");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("bob", "marle"));
	}
	
	@GetMapping(path="/person", params = "version=1")
	public PersonV1 getFirstVersionOfPersonParameter() {
		return new PersonV1("Rohit Sharma");
	}
	
	@GetMapping(path="/person", params = "version=2")
	public PersonV2 getSecondVersionOfPersonParameter() {
		return new PersonV2(new Name("bob", "marle"));
	}
	
	@GetMapping(path="/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getFirstVersionOfPersonHeader() {
		return new PersonV1("Rohit Sharma");
	}
	
	@GetMapping(path="/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getsecondVersionOfPersonHeader() {
		return new PersonV2(new Name("bob", "marle"));
	}
	
	@GetMapping(path="/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionOfPersonMedia() {
		return new PersonV1("Rohit Sharma");
	}
	
	@GetMapping(path="/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getsecondVersionOfPersonMedia() {
		return new PersonV2(new Name("bob", "marle"));
	}

}
