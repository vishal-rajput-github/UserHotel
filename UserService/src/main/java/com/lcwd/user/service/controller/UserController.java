package com.lcwd.user.service.controller;

import com.lcwd.user.service.entity.User;
import com.lcwd.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public ResponseEntity<User> create(@RequestBody User user){
       User  save =  userService.savedata(user);
       return new ResponseEntity<>(save, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllData(){
        List<User> alldata = userService.getAllUser();
        return ResponseEntity.ok(alldata);
    }
    @GetMapping("/{userid}")
    public ResponseEntity<User> getById(@PathVariable String userid){
       User id =  userService.getUser(userid);
       return ResponseEntity.ok(id);
    }
}


