package com.springboot.recapcurrent;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{

    @Autowired
    FakeRepoInterface repo;

    @Override
    public void addUser(String name, String surname) {
      String myName = repo.insertUser(1,name,surname);
        System.out.println("My name is:" + myName);

    }

    @Override
    public void removeUser(long Id) {
        String removedName = repo.deleteUser(Id);
        System.out.println(removedName + "removed");

    }

    @Override
    public void getUser(long Id) {
        String addedName =  repo.findUserById(Id);
        System.out.println("Hello" + addedName);

    }
}
