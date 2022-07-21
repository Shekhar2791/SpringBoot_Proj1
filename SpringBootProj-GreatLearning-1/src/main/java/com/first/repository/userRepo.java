package com.first.repository;

import org.springframework.data.repository.CrudRepository;

import com.first.entity.User;

public interface userRepo extends CrudRepository<User, Integer>{

}
