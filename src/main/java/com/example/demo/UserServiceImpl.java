package com.example.demo;

import com.example.demo.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private FakeRepo fakeRepo;

    @Override
    public void addUser(String name, String surname) {
        fakeRepo.insertUser(1,name,surname);
        System.out.println(name+" entered");

    }

    @Override
    public void removeUser(long Id) {
        fakeRepo.deleteUser(Id);
        System.out.println(Id+" removed");
    }

    @Override
    public void getUser(long Id) {
        fakeRepo.findUserById(Id);
        System.out.println("hello "+Id);

    }
}
