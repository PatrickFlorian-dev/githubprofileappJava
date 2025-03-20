package com.example.githubprofileapp.repository;

import com.example.githubprofileapp.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        // Adding some dummy users
        users.add(new User(1L, "Alice", "alice@example.com", "dfgsdsfwfdsd"));
        users.add(new User(2L, "Bob", "bob@example.com", "asdasdasda"));
    }

    public List<User> findAll() {
        return users;
    }
}