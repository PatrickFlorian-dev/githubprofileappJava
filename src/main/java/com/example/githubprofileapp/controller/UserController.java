package com.example.githubprofileapp.controller;

import com.example.githubprofileapp.service.UserService;
import com.example.githubprofileapp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "index";  // Refers to index.html in templates
    }
}