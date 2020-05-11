package com.example.demo.Dao;

import com.example.demo.Entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<Integer, User> users;

    static {
        users = new HashMap<Integer, User>(){
            {
               put(1, new User(1,"Andiswa","Mkhonto"));
               put(2, new User(2,"Omi","Nkosi"));
               put(3, new User(3,"Andile","Khumalo"));
               put(4, new User(4,"Lindani","Nkomo"));
               put(5, new User(5,"Thuli","Faku"));
            }
        };
    }

}
