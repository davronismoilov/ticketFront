package com.example.ticketfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/api/route")
public class RouteController {


    @GetMapping("/getAll")
    public String getAllRoutes(){
        return null;
    }

    @GetMapping("/get")
    public String getRoute(){
        return null;
    }

    @PostMapping("/add")
    public String addRoute(){
        return null;
    }

    @PutMapping("/edit")
    public String editRoute(){
        return  null;
    }

    @PostMapping("/getTraffics")
    public String getTrafficsByStations(){

        return null;
    }
}
