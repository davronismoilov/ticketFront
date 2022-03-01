package com.example.ticketfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoleItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;
}