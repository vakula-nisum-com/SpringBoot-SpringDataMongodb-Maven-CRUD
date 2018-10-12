package com.vijay.springdatamongodb.model;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
	@Id
	private String userId;
	@NotBlank
	@javax.validation.constraints.NotEmpty
	private String name;
	private int age;
	private String email;

}
