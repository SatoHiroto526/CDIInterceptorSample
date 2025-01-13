package com.example.service;

import jakarta.enterprise.context.RequestScoped;

import com.example.util.InterceptorAnnotation;

@RequestScoped
public class SampleService {
	
	@InterceptorAnnotation
	//本メソッドにインターセプタを適用
	public String sampleService() {
		return "Hello CDIInterceptor!";
	}

}
