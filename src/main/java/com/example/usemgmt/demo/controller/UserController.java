package com.example.usemgmt.demo.controller;

import com.example.usemgmt.demo.model.User;
import com.example.usemgmt.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user){
        return userService.register(user);
    }
    @GetMapping("/fetch")
    public ResponseEntity<?> fetchUser(@RequestParam String username){
        return userService.fetchUser(username);
    }
}
