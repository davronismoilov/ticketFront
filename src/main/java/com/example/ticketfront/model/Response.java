package com.example.ticketfront.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response{

	@JsonProperty("data")
	private DataUser data;

	@JsonProperty("message")
	private String message;

	@JsonProperty("statusCode")
	private int statusCode;
}