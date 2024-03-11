package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.web.model.User;
import com.web.repo.UserRepo;
@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserRepo repo;

	@Override
	public User saveUser(User user) {
		User u=repo.save(user);
		return u;
	}
	
	@Override
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}

	
	
	@Override
	public User updateUser(User user) {
		User u=repo.save(user);
		return u;
	}
	
	

	@Override
	public User getUser(Integer id) {
		User get=repo.findById(id).get();
		return get;
	}

	@Override
	public List<User> getAll() {
		List<User> users=(List<User>) repo.findAll();
		return users;
	}

}
