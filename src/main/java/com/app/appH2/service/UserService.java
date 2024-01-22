package com.app.appH2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.appH2.model.User;
import com.app.appH2.repopsitory.UserRepository;

@Component
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User insertarUser(User user) {
		return userRepository.save(user);
	}
	
	public User obtenerUserById(Integer id) {
		Optional<User> optionalUser = userRepository.findById(id);
		return optionalUser.get();
	}
	
	public List<User> obtenerAllUsers() {
		return userRepository.findAll();
	}
	
	public void eliminarUsers(Integer id) {
		userRepository.deleteById(id);
	}
	
}
