package com.jaiganesh.simpleSpringBootApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simpleSpringBootRestController {
	
	@RequestMapping("/hello")
	public String getHello() {
		return "Hi";
	}

}
