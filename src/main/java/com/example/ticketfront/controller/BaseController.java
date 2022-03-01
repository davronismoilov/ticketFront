package com.example.ticketfront.controller;

import com.example.ticketfront.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BaseController {
    @GetMapping({"/login"})
    public String getAdminPanel(Model model)
    {
        model.addAttribute("user" , new User());
        return "login";

    }
}
