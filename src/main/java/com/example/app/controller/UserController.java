package com.example.app.controller;

import com.example.app.model.User;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/getAllUser")
    public List<User> getAllUser(){return userService.getAllUsers();}

    @PostMapping(path = "/addUser")
    public String addUser(@RequestBody User user){return userService.addUser(user);}

    @DeleteMapping(path = "/deleteUser/{userId}")
    public String deleteUser(@PathVariable Integer userId){return userService.deleteUser(userId);}

    @PutMapping(path = "/updateUser")
    public String updateUser(@RequestBody User user){return userService.updateUser(user);}

}
