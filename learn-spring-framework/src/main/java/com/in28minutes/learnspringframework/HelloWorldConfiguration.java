package com.in28minutes.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// Released in JDK 16
record Person(String name, int age, Address address) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Miguel";
	}
	
	@Bean
	public int age() {
		return 26;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	//Auto-Wired by spring
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);
	}
	
	@Bean
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address); //name, age, address1
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address2qualifier") Address address) {
		return new Person(name, age, address); //name, age, address2
	}
	
	@Bean(name = "address1")
	@Primary
	public Address address() {
		return new Address("Baker Street", "London");
	}
	
	// Bean can have a different name that is not the method name
	@Bean(name = "address2")
	@Qualifier("address2qualifier")
	public Address address2() {
		return new Address("Belem", "Lisboa");
	}
}
