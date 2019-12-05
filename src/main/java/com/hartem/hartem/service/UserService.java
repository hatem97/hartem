package com.hartem.hartem.service;

import com.hartem.hartem.dao.UserRepository;

import com.hartem.hartem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User getUser(Integer id){
        return repository.getOne(id);}

    public void addUSer(User user){
        repository.save(user);}

    public User findAll(User user){
        return findAll(user);}

    public void delete(User user){
        repository.delete(user);}


}