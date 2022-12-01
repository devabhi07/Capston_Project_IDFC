package com.foodapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.foodapp.model.Driver;

@Repository
public interface DriverRepository extends MongoRepository<Driver, String> {

}
