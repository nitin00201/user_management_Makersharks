package com.example.usemgmt.demo.service;

import com.example.usemgmt.demo.model.User;
import com.example.usemgmt.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String register( User user) {
        try{
            userRepository.save(user);
            return "user registered successfully";
        }
        catch(Exception e){
            return "an error occurred";
        }
    }

    @Override
    public ResponseEntity<?> fetchUser(String username) {

        User user = userRepository.findByUsername(username);
        if (user != null){
            return ResponseEntity.ok(user);
        }
        else {
            return ResponseEntity.ok("No user present");
        }
    }
}
