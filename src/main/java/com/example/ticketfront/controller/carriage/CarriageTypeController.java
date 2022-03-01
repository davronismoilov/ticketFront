package com.example.ticketfront.controller.carriage;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/carriage_type/")
public class CarriageTypeController {




    @GetMapping("list")
    public String getCarriageType() {
        return null;
    }
}
