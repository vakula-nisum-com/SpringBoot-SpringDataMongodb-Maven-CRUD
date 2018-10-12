package com.vijay.springdatamongodb.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.springdatamongodb.model.User;
import com.vijay.springdatamongodb.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> create(@Valid @RequestBody User user) {

		User existingUser = userRepository.findByName(user.getName().trim());
		System.out.println("the user existed details::" + existingUser);
		if (existingUser == null) {
			userRepository.save(user);

			return new ResponseEntity<String>("User Created successfully", HttpStatus.OK);
			// isExisted = userRepository.existsById(existingUser.getId());

		}
		return new ResponseEntity<String>("User Already Existed", HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody User user) {
		userRepository.save(user);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		userRepository.deleteById(id);

	}

	@GetMapping("all")
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@GetMapping(value = "byid/{id}")
	public Optional<User> getById(@PathVariable String id) {
		// return userRepository.findOne(id);
		return userRepository.findById(id);
	}

	@GetMapping("/sortbyname")
	public List<User> read() {

		// Pageable pageable=new PageRequest(page, size)
		Sort sorting = new Sort(Direction.ASC, "name");
		return userRepository.findAll(sorting);
	}

	@GetMapping("pagination")
	public Page<User> pagination() {
		Pageable pageable = new PageRequest(1, 10);
		return userRepository.findAll(pageable);
	}
}