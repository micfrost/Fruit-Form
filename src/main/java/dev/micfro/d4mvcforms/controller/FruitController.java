package dev.micfro.d4mvcforms.controller;

import dev.micfro.d4mvcforms.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    List<User> users = new ArrayList<>();

        users.add(new User("John", "Male"));
        users.add(new User("Alice", "Female"));


    @GetMapping("/userform")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "userform";
    }

    @PostMapping("/userform")
    public String addUser(@ModelAttribute("user") User user){
        System.out.println(user);
        return "userconfirm";
    }

}
