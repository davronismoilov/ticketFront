package com.example.ticketfront.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/api/station")
public class StationController {



    @GetMapping("/getAll")
    public String getAllStations(){
        return null;
    }

    @GetMapping("/get")
    public String getStation(){
        return "index";
    }

    @PostMapping("/add")
    public String addStation(){
       return null;
    }

    @PutMapping("/edit")
    public String editStation(){
        return null;
    }

}
