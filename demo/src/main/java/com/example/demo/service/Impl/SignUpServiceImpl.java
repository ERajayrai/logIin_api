package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mappar.SignUpMappar;
import com.example.demo.request.model.SignUpRequestModel;
import com.example.demo.service.SigUpService;

@Service
public class SignUpServiceImpl implements SigUpService {
	@Autowired
	SignUpMappar signUpMappar;
	@Override
	public Integer signUp(SignUpRequestModel signUpRequest) {
		try {
			signUpMappar.insert(signUpRequest);
			System.out.println(signUpRequest.getEmail()+"" +signUpRequest.getPassword());
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

}
