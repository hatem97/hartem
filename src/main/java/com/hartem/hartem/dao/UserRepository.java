package com.hartem.hartem.dao;


import com.hartem.hartem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {




}
