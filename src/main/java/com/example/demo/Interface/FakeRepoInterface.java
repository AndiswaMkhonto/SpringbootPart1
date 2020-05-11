package com.example.demo.Interface;

import com.example.demo.Entity.User;

import java.util.Collection;

public interface FakeRepoInterface {

    public Collection<User> insertUser(long id, String name, String surname);

    public User findUserById(long id);



    public void deleteUser(long id);



}
