package com.stackroute.userservice.controller;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.UserServiceApplication;
import com.stackroute.userservice.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1")
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("User")
    public ResponseEntity<?> setUser(@RequestBody User user){
        userService.saveUser(user);
        return new ResponseEntity<>("saveUser", HttpStatus.OK);
    }
    @GetMapping("User/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") int id) {
        User user=userService.getUserById(id);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}

