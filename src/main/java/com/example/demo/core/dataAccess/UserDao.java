package com.example.demo.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmail(String email);

}
