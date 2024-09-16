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
	private static int userCount = 0;
	static {
		users.add(new User(++userCount, "Adam", LocalDate.now().minusYears(40)));
		users.add(new User(++userCount, "wolkop", LocalDate.now().minusYears(20)));
		users.add(new User(++userCount, "ranga", LocalDate.now().minusYears(30)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId() == id;
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public User save(User user) {
		users.add(user);
		user.setId(++userCount);
		return user;
	}
	
	public boolean deleteById(int id) {
	    Predicate<? super User> predicate = user -> user.getId() == id;
	    return users.removeIf(predicate);
	}
	
//	public void deleteById(int id) {
//	    Predicate<? super User> predicate = user -> user.getId() == id;
//	    users.removeIf(predicate);
//	}

}
