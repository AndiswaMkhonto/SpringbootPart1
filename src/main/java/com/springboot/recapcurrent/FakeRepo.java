package com.springboot.recapcurrent;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository

public class FakeRepo implements FakeRepoInterface {
    ArrayList<User> userList = new ArrayList<User>();
    User user;

    @Override
    public String insertUser(long id, String name, String surname) {
        User user = new User(id, name, surname);
        userList.add(user);
        return name;
    }

    @Override
    public String findUserById(long id) {
        for (User val : userList) {
            if (val.getId() == id) {
                return val.getName();
            }
        }
        return null;
    }

    @Override
    public String deleteUser(long id) {
        for (User val: userList )
        {
            if(val.getId() == id){

            }
        }
        return null;
    }
        //return user.remove(id);
        //return null;
}


