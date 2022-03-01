package com.example.ticketfront.controller;

import com.example.ticketfront.model.Response;
import com.example.ticketfront.model.ResponseTrain;
import com.example.ticketfront.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {
    String url = "http://localhost:8081/api/user";

    final
    RestTemplate restTemplate;

    final
    ObjectMapper objectMapper;

    @Autowired
    public UserController(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }


    @PostMapping({"/login", "/adminpages"})
    public String login(@ModelAttribute User user, Model model) throws JsonProcessingException {

        String s = restTemplate.postForObject(url + "/login", user, String.class);
        Response response = objectMapper.readValue(s, Response.class);
        if (response.getStatusCode() == 0) {
            model.addAttribute("user", response.getData());
            return "adminpage";
        }

        model.addAttribute("success", false);
        model.addAttribute("message", response.getMessage());
        return "login";

    }

    @PostMapping("register")
    public String register(@ModelAttribute User user, Model model) throws JsonProcessingException {


        String s = restTemplate.postForObject(url + "/register", user, String.class);
        Response response = objectMapper.readValue(s, Response.class);
        if (response.getStatusCode() == -30) {
            model.addAttribute("success", false);
            model.addAttribute("message", response.getMessage());
            return "register";
        }

            return "login";


    }

    @GetMapping("/register")
    public String registration(Model model){
        model.addAttribute("success" , true);
        model.addAttribute("user" , new User());
        return "register";
    }

}
