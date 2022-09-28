package com.codepay.mycodepay;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codepay.mycodepay.models.User;

public interface UserRepository extends  JpaRepository<User, Integer>{
Optional<User> findUserByUserName(String userName);

}
