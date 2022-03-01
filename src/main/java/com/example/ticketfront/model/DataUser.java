package com.example.ticketfront.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)public class DataUser{

	@JsonProperty("password")
	private String password;

	@JsonProperty("role")
	private List<RoleItem> role;

	@JsonProperty("id")
	private long id;

	@JsonProperty("username")
	private String username;
}