package com.example.app.service;

import com.example.app.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    public String addUser(User user);
    public String deleteUser(Integer userId);
    public String updateUser(User user);

}
