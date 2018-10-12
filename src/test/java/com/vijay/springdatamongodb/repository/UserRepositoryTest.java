//package com.vijay.springdatamongodb.repository;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.vijay.springdatamongodb.config.MongoConfig;
//
////import com.vijay.springdatamongodb.config.SpringMongoConfig;
//
////@ContextConfiguration(classes = { MongoConfig.class })
////@RunWith(SpringJUnit4ClassRunner.class)
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserRepositoryTest {
//
//	@Autowired
//	private UserRepository userRepository;
//
//	@Before
//	public void before() {
//		System.out.println("Before method");
//	}
//
//	@Test
//	public void test1() {
//		boolean isExists = userRepository.existsById("E17");
//		System.out.println("is employee exists" + isExists);
//	}
//
//	@After
//	public void afterMethod() {
//		System.out.println("after method");
//	}
//
//}
