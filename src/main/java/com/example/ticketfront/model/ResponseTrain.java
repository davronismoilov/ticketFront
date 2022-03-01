package com.example.ticketfront.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseTrain {
    @JsonProperty("data")
    private List<Train> data;

    @JsonProperty("message")
    private String message;

    @JsonProperty("statusCode")
    private int statusCode;
}
