package com.example.demo.Interface;

import com.example.demo.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {

    public void addUser(String name, String surname);

    public void removeUser(long Id);

    public void getUser(long Id);
}
