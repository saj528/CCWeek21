package com.alexjoiner.week21app.web;

import com.alexjoiner.week21app.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLogin (ModelMap model) {
        User user = new User();

        model.put("user", user);

        return "login";
    }
}
