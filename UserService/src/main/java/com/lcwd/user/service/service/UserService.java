package com.lcwd.user.service.service;

import com.lcwd.user.service.entity.User;

import java.util.List;

public interface UserService {

    User savedata(User user);

    List<User> getAllUser();

    User getUser(String userid);

}
