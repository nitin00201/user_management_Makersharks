package com.example.usemgmt.demo.service;

import com.example.usemgmt.demo.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    String register(User user);
    ResponseEntity<?> fetchUser(String username);
}
