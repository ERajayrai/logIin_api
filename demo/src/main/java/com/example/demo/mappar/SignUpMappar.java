package com.example.demo.mappar;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.request.model.SignUpRequestModel;
@Mapper
public interface SignUpMappar {
	
	@Insert("INSERT INTO login(email,password)VALUES(#{email},#{password})")
	void insert (SignUpRequestModel login);
}
