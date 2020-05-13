package com.example.spring.dao;

import java.util.UUID;

public interface UserService {

    public void addUser(UUID id,String name, String surname);

    public void removeUser(UUID Id);

    public void getUser(UUID Id);
}
