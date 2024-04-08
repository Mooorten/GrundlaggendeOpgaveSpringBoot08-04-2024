package com.example.grundlaggendeopgavespringboot08042024.UseCase;

import com.example.grundlaggendeopgavespringboot08042024.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public static final List<User> users = new ArrayList<>();

    public void createUser(User user){
        users.add(user);
    }
    public List<User> getUsers(){
        return users;
    }
}