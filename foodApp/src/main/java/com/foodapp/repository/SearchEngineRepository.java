package com.foodapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.foodapp.model.SearchEngine;

public interface SearchEngineRepository extends MongoRepository<SearchEngine, String> {

}
