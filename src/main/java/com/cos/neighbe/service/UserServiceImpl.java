package com.cos.neighbe.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.cos.neighbe.dao.UserDao;
import com.cos.neighbe.model.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	private final UserDao userDao;
	
	@Override
	public List<User> getUsers() throws ExecutionException, InterruptedException {
		return userDao.getUsers();
	}

}
