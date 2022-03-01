package com.example.ticketfront.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrainDto{

	@JsonProperty("code")
	private String code;

	@JsonProperty("capacity")
	private int capacity;
}