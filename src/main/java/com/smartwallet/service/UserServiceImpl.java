package com.smartwallet.service;

import com.smartwallet.model.User;
import com.smartwallet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){
        Iterable<User> iterable = userRepository.findAll();

        List<User> users = new ArrayList<>();
        iterable.forEach(e -> users.add(e));

        return users;
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
