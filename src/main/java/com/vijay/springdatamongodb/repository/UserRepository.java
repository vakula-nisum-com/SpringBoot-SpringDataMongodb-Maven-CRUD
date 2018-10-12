package com.vijay.springdatamongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.vijay.springdatamongodb.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	public User findByName(String name);
	
	public User findByUserId(String userId);

}