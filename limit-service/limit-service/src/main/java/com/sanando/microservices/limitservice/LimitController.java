package com.sanando.microservices.limitservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

	@Value("${limit.service.max}")
	private int max;
	
	@Value("${limit.service.min}")
	private int min;
	
	@GetMapping("/fixedval")
	public LimitBean getLimitValue() {
		return new LimitBean(max, min);
	}

}
