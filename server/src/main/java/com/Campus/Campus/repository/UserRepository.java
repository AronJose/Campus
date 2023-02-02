package com.Campus.Campus.repository;

import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.Campus.Campus.entity.User;

public interface UserRepository extends Repository<User, Integer> {

    User save(User user);

    Optional<User> findByEmail(String email);

    Optional<User> findByUserIdAndPassword(Integer userId, String password);

}
