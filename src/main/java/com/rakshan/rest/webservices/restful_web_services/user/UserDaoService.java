package com.rakshan.rest.webservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import java.util.function.Predicate;



@Component
public class UserDaoService {
	//jpa/hibernate -database
	//userDaoService = static list
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Adam", LocalDate.now().minusYears(40)));
		users.add(new User(2, "wolkop", LocalDate.now().minusYears(20)));
		users.add(new User(2, "ranga", LocalDate.now().minusYears(30)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId() == id;
		
		return users.stream().filter(predicate).findFirst().get();
	}
}
