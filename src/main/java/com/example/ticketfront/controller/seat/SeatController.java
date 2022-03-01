package com.example.ticketfront.controller.seat;



import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/seat/")
public class SeatController {

    @PutMapping(value = "update")
    public String updateSeat() {
        return null;
    }


}
