package com.example.demo.controller;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.model.LogInRequestModel;
import com.example.demo.request.model.SignUpRequestModel;
import com.example.demo.response.model.JsonResponse;
import com.example.demo.service.Impl.LogInServiceImpl; 
import com.example.demo.service.Impl.SignUpServiceImpl;
@CrossOrigin
@MappedTypes(SignUpRequestModel.class)
@MapperScan("com.example.demo.mappar")
@RestController
public class LogInController {
	@Autowired
	SignUpServiceImpl signUpServiceImpl;
	@Autowired
	LogInServiceImpl logInServiceImpl;
	
	@RequestMapping(value ="/signup",method=RequestMethod.POST)
	public @ResponseBody JsonResponse getSignUp(@RequestBody SignUpRequestModel signUpRequestModel) {
		if(signUpServiceImpl.signUp(signUpRequestModel)==1) {

			return new JsonResponse(1, "Record is inserted", signUpServiceImpl.signUp(signUpRequestModel));
		}
		else {
			return new JsonResponse(0, "Record is not inserted,please try angain letter", signUpServiceImpl.signUp(signUpRequestModel));
		}
	}
	@RequestMapping(value ="/login",method=RequestMethod.POST)
	public @ResponseBody JsonResponse getLogIn( @RequestBody LogInRequestModel logInRequestModel) {
		
		return new JsonResponse(null, null, logInServiceImpl.validateLogin(logInRequestModel));
	}
}
