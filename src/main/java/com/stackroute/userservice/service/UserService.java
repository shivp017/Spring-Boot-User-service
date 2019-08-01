package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
public User getUserById(int id);
   // public List<User> getAllUser();


}
