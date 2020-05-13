package com.example.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;
import com.example.spring.model.User;


public class UserServiceImpl implements UserService {
    private  final FakeRepo fakeRepo;
    private final User user;
    @Autowired

    public UserServiceImpl(FakeRepo fakeRepo, User user) {
        this.fakeRepo = fakeRepo;
        this.user = user;
    }

    @Override
    public void addUser(UUID id, String name, String surname) {

    }

    @Override
    public void removeUser(UUID Id) {
        fakeRepo.deleteUser(Id);
    }

    @Override
    public void getUser(UUID Id) {
        fakeRepo.findUserById(Id);
    }
}
