package com.skillgroove.skillgroove.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.skillgroove.skillgroove.models.User;

public interface UserRepository extends MongoRepository <User, Integer> {

	

	
	

}