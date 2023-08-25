package com.in28minutes.rest.webservices.resfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.resfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
