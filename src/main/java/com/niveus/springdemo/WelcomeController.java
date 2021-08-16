package com.niveus.springdemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
private static final Log LOGGER = LogFactory.getLog(WelcomeController.class);
	
	
	@GetMapping("/welcome")
	String welcome() {
		
		LOGGER.info("Inside Welcome End Point.......");
		String version = "1.0";
		return "Niveus Solutions - Kubernetes Demo "+version;
	}

}
