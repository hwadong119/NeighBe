package com.cos.neighbe.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Data
public class User {
	
	private int id;
	private String email;
	private String password;
	 
}
