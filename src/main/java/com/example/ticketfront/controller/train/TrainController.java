package com.example.ticketfront.controller.train;


import com.example.ticketfront.model.ResponseTrain;
import com.example.ticketfront.payload.TrainDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@Controller
@RequestMapping("/train/")
public class TrainController {
      String url = "http://localhost:8081/api/train/";

    final
    RestTemplate restTemplate;

    final
    ObjectMapper objectMapper;

    @Autowired
    public TrainController(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    // TODO: 19.02.2022 CRUD
    @PostMapping(value = "save")
    public String addTrain(@ModelAttribute TrainDto trainDto ,Model model) throws JsonProcessingException {
        restTemplate.postForObject(url+"save" , trainDto , String.class);
        String s = restTemplate.getForObject(url + "findAll", String.class);
        ResponseTrain trains = objectMapper.readValue(s, ResponseTrain.class);
        model.addAttribute("trains" , trains.getData());
        model.addAttribute("train" , new TrainDto());
        return "train";
    }

    @GetMapping(value = "add")
    public String addTrainGet(Model model) throws JsonProcessingException {
        model.addAttribute("train" , new TrainDto());
        String s = restTemplate.getForObject(url + "findAll", String.class);
        ResponseTrain trains = objectMapper.readValue(s, ResponseTrain.class);
        model.addAttribute("trains" , trains.getData());
        return "train";
    }

    @PostMapping(value = "update")
    public String updateTrain() {
        return null;
    }

    @GetMapping(value = "delete/{id}")
    public String deleteTrain(@PathVariable("id") Long id, Model model) throws JsonProcessingException {
        String s1 = restTemplate.postForObject(url + "delete", id, String.class);
        model.addAttribute("train" , new TrainDto());
        String s = restTemplate.getForObject(url + "findAll", String.class);
        ResponseTrain trains = objectMapper.readValue(s, ResponseTrain.class);
        model.addAttribute("trains" , trains.getData());
        return "train";
    }

    @GetMapping(value = "findById")
    public ResponseEntity<?> getTrainById(@PathVariable Long id) {
        return null;
    }

    @GetMapping(value = "findAll")
    public String getTrainList(Model model) throws JsonProcessingException {
        String s = restTemplate.getForObject(url + "findAll", String.class);
        ResponseTrain trains = objectMapper.readValue(s, ResponseTrain.class);
        model.addAttribute("trains" , trains.getData());
        System.out.println(trains);
        return "adminpage";
    }

}
