package com.example.grundlaggendeopgavespringboot08042024.Controller;

import com.example.grundlaggendeopgavespringboot08042024.Model.User;
import com.example.grundlaggendeopgavespringboot08042024.UseCase.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/createuser")
    public String brugerForm(Model model){
        model.addAttribute("user", new User());
        return "user";
    }
    @PostMapping("/createuser")
    public String userSubmit(@ModelAttribute User user, Model model){
        userService.createUser(user);
        model.addAttribute("user", user);
        return "result";
    }
}