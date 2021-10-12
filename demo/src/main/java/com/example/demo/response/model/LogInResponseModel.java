package com.example.demo.response.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LogInResponseModel {
	
	public  LogInResponseModel(boolean b) {
		this.isValid=b;
	}

	private boolean isValid;
}
