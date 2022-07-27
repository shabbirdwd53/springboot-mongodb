package com.dailycodebuffer.springbootmongodb.repository;

import com.dailycodebuffer.springbootmongodb.collection.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends MongoRepository<Photo, String> {
}
