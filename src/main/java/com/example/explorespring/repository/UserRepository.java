package com.example.explorespring.repository;

import com.example.explorespring.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
