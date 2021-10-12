package com.example.demo.service;

import com.example.demo.request.model.LogInRequestModel;
import com.example.demo.response.model.LogInResponseModel;



public interface LogInService {
	public LogInResponseModel validateLogin(LogInRequestModel loginRequest);
}
