package com.example.app.service;

import com.example.app.model.User;
import com.example.app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public String addUser(User user) {
        userRepository.save(user);
        return "User Added Successfully";
    }

    @Override
    public String deleteUser(Integer userId) {
        userRepository.deleteById(userId);
        return "User Deleted Successfully";
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "User Updated Successfully";
    }
}
