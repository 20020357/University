package com.backend.demoJPAMySQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class})
public class DemoJpaMySqlApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoJpaMySqlApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		//Get all user in database
		userRepository.findAll().forEach(System.out::println);

		//Save user on database
		User user = userRepository.save(new User());

		//When it saves, it returns User which saved with their id
		System.out.println("User vua luu co ID: " + user.getId());
		Long userId = user.getId();

		//Update user
		user.setAgi(100);
		userRepository.save(user);

		//Query just user to check
		User user2 = userRepository.findById(userId).get();
		System.out.println("User: " + user);
		System.out.println("User2: " + user2);

		//Delete user from database
		userRepository.delete(user);

		User user3 = userRepository.findById(userId).orElse(null);
		System.out.println("User3: " + user3);
	}

}
