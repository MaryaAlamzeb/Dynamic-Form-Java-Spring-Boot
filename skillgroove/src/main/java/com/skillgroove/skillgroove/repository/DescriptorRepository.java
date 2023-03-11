package com.skillgroove.skillgroove.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.skillgroove.skillgroove.models.Descriptor;

public interface DescriptorRepository extends MongoRepository<Descriptor, String> {
}