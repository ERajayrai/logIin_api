package com.example.demo.response.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class JsonResponse {
	private Integer code;
	private String message;
	private Object data;
}
