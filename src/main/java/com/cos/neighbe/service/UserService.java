package com.cos.neighbe.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.cos.neighbe.model.User;

public interface	UserService {
	
	List<User> getUsers() throws ExecutionException, InterruptedException;

}
