package com.example.ticketfront.controller.carriage;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class CarriageController {



    @GetMapping("findAll")
    public String getCarriage() {
        return null;
    }

    @PostMapping("save")
    public String addCarriage() {
        return null;
    }

    @PutMapping("update")
    public String updateCarriage() {
        return null;
    }

    @DeleteMapping("delete")
    public String deleteCarriage(@PathVariable Long id) {
        return null;
    }

    @GetMapping("getById")
    public String getByIdCarriage(@PathVariable Long id) {
        return null;
    }
}
