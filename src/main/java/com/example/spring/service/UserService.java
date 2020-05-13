package com.example.spring.service;

import com.example.spring.dao.FakeRepoInterface;
import com.example.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


@Service
public class UserService {
    private  final FakeRepoInterface fakeRepoInterface;
    private final UserService userService;
     @Autowired
    public UserService(@Qualifier("fakeDao") FakeRepoInterface fakeRepoInterface, UserService userService) {
        this.fakeRepoInterface = fakeRepoInterface;
         this.userService = userService;
     }
    public int addUser(User user){
        return fakeRepoInterface.insertUser(user);
    }
    public Optional<User> findPersonById(UUID id){
         return fakeRepoInterface.findUserById(id);
    }
    public int deleteUser(UUID id){
         return fakeRepoInterface.deleteUser(id);
    }
    public int addUsers(User user){
         return userService.addUser(user);
    }
    public int removeUser(UUID id){
         return userService.removeUser(id);
    }
    public int getUser(UUID id){
         return userService.getUser(id);
    }

}
