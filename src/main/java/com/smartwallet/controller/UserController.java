package com.smartwallet.controller;

import com.smartwallet.model.User;
import com.smartwallet.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUsers(){
        User u = new User();
        u.setFirstName("Viktor");
        u.setLastName("Pesek");
        userServiceImpl.save(u);

        List<User> seznam = userServiceImpl.findAllUsers();

        return seznam;
    }
}
