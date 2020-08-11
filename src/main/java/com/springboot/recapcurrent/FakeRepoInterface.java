package com.springboot.recapcurrent;

public interface FakeRepoInterface {
    String insertUser(long id, String name, String surname);

    String findUserById(long id);

    String deleteUser(long id);

}
