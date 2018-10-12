package com.vijay.springdatamongodb.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vijay.springdatamongodb.repository.UserRepository;

public class UserService {

	@Autowired
	static UserRepository userRepository;

	public static void main(String[] args) {

		boolean isExists = userRepository.existsById("E17");
		System.out.println("is User Exists::" + isExists);
		System.out.println("new statement has been added");
		
	}
}
