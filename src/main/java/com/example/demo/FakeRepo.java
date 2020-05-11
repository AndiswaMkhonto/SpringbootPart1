package com.example.demo;


import com.example.demo.Interface.FakeRepoInterface;
import com.example.demo.Entity.User;
import org.springframework.stereotype.Repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class FakeRepo implements FakeRepoInterface {
    private static Map<Integer, User> users;
    //private static List<User> list = new ArrayList<>();
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





    @Override
    public Collection<User> insertUser(long id, String name, String surname) {
        return this.users.values();

    }

    @Override
    public  User findUserById(long  id)
    {
        return this.users.get(id);

    }

    @Override
    public void deleteUser(long id) {
         this.users.remove(id);

    }
}
