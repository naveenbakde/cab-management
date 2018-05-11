package com.mycab.cabservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class CabController {
	
	@Value("${testmessage}")
	private String msg;
	
	@RequestMapping(value = "/message")
	public String getMessage() {
		return this.msg;
	}

}
