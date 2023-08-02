package com.wpch.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wpch.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}