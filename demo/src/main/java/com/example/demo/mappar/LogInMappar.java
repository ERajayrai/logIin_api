package com.example.demo.mappar;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;


import com.example.demo.db.model.LoginDbModel;
@Mapper
public interface LogInMappar {
	@Select("select * from login where email=#{email} and password=#{password}")
	@ResultMap("login")
	public LoginDbModel getUserByCredential(String email,String password);
}
