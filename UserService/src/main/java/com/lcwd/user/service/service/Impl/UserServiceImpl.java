package com.lcwd.user.service.service.Impl;

import com.lcwd.user.service.entity.User;
import com.lcwd.user.service.exception.ResourceNotFoundException;
import com.lcwd.user.service.repository.UserRepository;
import com.lcwd.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User savedata(User user) {
        //generate user unique id
        String randomId = UUID.randomUUID().toString();
        user.setUserId(randomId);
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(String userid) {
        return userRepo.findById(userid).orElseThrow(
                ()-> new ResourceNotFoundException("User not found with id :" + userid)
        );
    }
}
