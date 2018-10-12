//package com.vijay.springdatamongodb.config;
//
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//
//import com.mongodb.Mongo;
//import com.mongodb.MongoClient;
//
//@Configuration
//@EnableMongoRepositories
//@ComponentScan(basePackages = { "com.vijay.springdatamongodb" })
//public class MongoConfig extends AbstractMongoConfiguration {
//	@Override
//	protected String getDatabaseName() {
//		return "springdata-mongodb-user";
//	}
//
//	@Override
//	protected String getMappingBasePackage() {
//		return "com.vijay.springdatamongodb";
//	}
//
//	@Override
//	public MongoClient mongoClient() {
//		// TODO Auto-generated method stub
//		return new MongoClient("127.0.0.1", 27017);
//	}
//
//}
