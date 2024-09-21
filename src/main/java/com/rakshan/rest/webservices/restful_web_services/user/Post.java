package com.rakshan.rest.webservices.restful_web_services.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min = 10)
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY) // for not fetching user details along with posts we use this lazy . if eager user deatils also comes
	@JsonIgnore
	private User customer;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "POST[id=" + id + ", DESCRIPTION="+ description + "]";
	}
}
