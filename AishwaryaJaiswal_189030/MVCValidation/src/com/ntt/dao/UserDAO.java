package com.ntt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ntt.model.User;

@Repository
public class UserDAO {
private static List<User> list = null;
	static{
		list = new ArrayList<User>();
		list.add(new User("Aishwarya", 10, "ishuaj10@gmail.com", "India","Aishwarya1234"));
	
	}
	public List<User> getUserList() {
		return list;
	}
	public void addUser(User user) {
		list.add(user);
	}
}
