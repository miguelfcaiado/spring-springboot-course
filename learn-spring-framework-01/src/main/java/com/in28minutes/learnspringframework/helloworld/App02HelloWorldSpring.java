package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// 1: Launch a Spring context
		
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			// 2: Configure the things that we want spring to manage - @Configuration
			// HelloWorldConfiguration - @Configuration
			// name - @Bean
			
			// 3: Retrieving Beans managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("person4Parameters"));
			System.out.println(context.getBean("person5Qualifier"));
			
			System.out.println(context.getBean("address1"));
			System.out.println(context.getBean(Address.class)); // Other way to call beans. 
			// Since we have the class Address used for more then one method we use the annotation @Primary to solve conflict 
			
			// Get a list of spring beans
			String beanNames[] = context.getBeanDefinitionNames();
			System.out.println(Arrays.toString(beanNames));
			
			// Tried this but I was getting an error
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);	
		}
	}

}
