package com.ntt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntt.dao.UserDAO;
import com.ntt.model.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public List<User> getUserList() {
		return userDAO.getUserList();
	}

	public void createUser(User user) {
		userDAO.addUser(user);
	}
}
