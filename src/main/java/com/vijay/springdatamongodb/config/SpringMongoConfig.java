//package com.vijay.springdatamongodb.config;
//
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.NoSuchBeanDefinitionException;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.convert.CustomConversions;
//import org.springframework.data.mongodb.core.convert.DbRefResolver;
//import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
//import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
//import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
//import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
//
//import com.mongodb.MongoClient;
//
//@Configuration
//public class SpringMongoConfig {
//
//	// @Bean
//	// public MappingMongoConverter mappingMongoConverter(MongoDbFactory
//	// factory, MongoMappingContext context,
//	// BeanFactory beanFactory) {
//	// DbRefResolver dbRefResolver = new DefaultDbRefResolver(factory);
//	// MappingMongoConverter mappingConverter = new
//	// MappingMongoConverter(dbRefResolver, context);
//	// try {
//	// mappingConverter.setCustomConversions(beanFactory.getBean(CustomConversions.class));
//	// } catch (NoSuchBeanDefinitionException ignore) {
//	// System.out.println("Exception occured due to:");
//	// }
//	// mappingConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
//	//
//	// return mappingConverter;
//	// }
//
//	
//	
//	@Bean
//	public MongoTemplate mongoTemplate() throws Exception {
//		return new MongoTemplate(new MongoClient("localhost"), "");
//	}
//
//	
//}
