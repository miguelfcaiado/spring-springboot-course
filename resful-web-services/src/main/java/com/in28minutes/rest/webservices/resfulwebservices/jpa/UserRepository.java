package com.in28minutes.rest.webservices.resfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.resfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
