package com.skillgroove.skillgroove.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.skillgroove.skillgroove.models.Service;

public interface ServiceRepository extends MongoRepository<Service, String> {

}
