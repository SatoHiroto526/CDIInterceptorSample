package com.example.resource;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import com.example.service.SampleService;
import com.example.util.InterceptorAnnotation;

@Path("api")
@RequestScoped
//本クラスの全てのメソッドにインターセプタを適用
@InterceptorAnnotation
public class SampleResource {
	
	@Inject
	private SampleService service;
	
	@Path("sampleresource")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sampleResource() {
		return service.sampleService();
	}

}
