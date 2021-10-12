package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.db.model.LoginDbModel;
import com.example.demo.mappar.LogInMappar;
import com.example.demo.request.model.LogInRequestModel;
import com.example.demo.response.model.LogInResponseModel;
import com.example.demo.service.LogInService;

@Service
public class LogInServiceImpl implements LogInService {
	
	@Autowired
	LogInMappar logInMapper;
	@Override
	public LogInResponseModel validateLogin(LogInRequestModel loginRequest) {
		LoginDbModel loginDbModel=logInMapper.getUserByCredential(loginRequest.getEmail(), loginRequest.getPassword());
		if(loginDbModel!=null) {

			return new LogInResponseModel(true);
			
		}
		else {

			return new LogInResponseModel(false);
			
		}
	}

}
