package com.hartem.hartem.controller;

import com.hartem.hartem.dao.UserRepository;

import com.hartem.hartem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    String addNewUser (@RequestParam String nome, @RequestParam String cognome) {

        User u = new User();

        userRepository.save(u);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}