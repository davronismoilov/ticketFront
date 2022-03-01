package com.example.ticketfront.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Train{

	@JsonProperty("updatedBy")
	private Object updatedBy;

	@JsonProperty("createdDate")
	private Object createdDate;

	@JsonProperty("code")
	private String code;

	@JsonProperty("createdBy")
	private Object createdBy;

	@JsonProperty("active")
	private boolean active;

	@JsonProperty("id")
	private int id;

	@JsonProperty("updatedDate")
	private Object updatedDate;

	@JsonProperty("capacity")
	private int capacity;
}