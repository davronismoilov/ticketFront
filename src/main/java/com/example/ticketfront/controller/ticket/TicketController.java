package com.example.ticketfront.controller.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/ticket")
public class TicketController {



    public String getTicketList() {
        return  null;
    }



    public String addTicket() {
        return null;
    }

    public String  editTicket() {
        return null;
    }

    public ResponseEntity<?> deleteTicket() {
        return null;
    }
}
